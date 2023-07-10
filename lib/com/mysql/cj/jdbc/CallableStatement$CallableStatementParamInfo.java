/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.jdbc;

import com.mysql.cj.Messages;
import com.mysql.cj.MysqlType;
import com.mysql.cj.PreparedQuery;
import com.mysql.cj.conf.PropertyKey;
import com.mysql.cj.exceptions.CJException;
import com.mysql.cj.jdbc.CallableStatement;
import com.mysql.cj.jdbc.exceptions.SQLError;
import com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping;
import java.sql.ParameterMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CallableStatement.CallableStatementParamInfo
implements ParameterMetaData {
    String dbInUse;
    boolean isFunctionCall;
    String nativeSql;
    int numParameters;
    List<CallableStatement.CallableStatementParam> parameterList;
    Map<String, CallableStatement.CallableStatementParam> parameterMap;
    boolean isReadOnlySafeProcedure = false;
    boolean isReadOnlySafeChecked = false;

    CallableStatement.CallableStatementParamInfo(CallableStatement.CallableStatementParamInfo fullParamInfo) {
        this.nativeSql = ((PreparedQuery)CallableStatement.this.query).getOriginalSql();
        this.dbInUse = CallableStatement.this.getCurrentDatabase();
        this.isFunctionCall = fullParamInfo.isFunctionCall;
        int[] localParameterMap = CallableStatement.this.placeholderToParameterIndexMap;
        int parameterMapLength = localParameterMap.length;
        this.isReadOnlySafeProcedure = fullParamInfo.isReadOnlySafeProcedure;
        this.isReadOnlySafeChecked = fullParamInfo.isReadOnlySafeChecked;
        this.parameterList = new ArrayList<CallableStatement.CallableStatementParam>(fullParamInfo.numParameters);
        this.parameterMap = new HashMap<String, CallableStatement.CallableStatementParam>(fullParamInfo.numParameters);
        if (this.isFunctionCall) {
            this.parameterList.add(fullParamInfo.parameterList.get(0));
        }
        int offset = this.isFunctionCall ? 1 : 0;
        for (int i = 0; i < parameterMapLength; ++i) {
            if (localParameterMap[i] == 0) continue;
            CallableStatement.CallableStatementParam param = fullParamInfo.parameterList.get(localParameterMap[i] + offset);
            this.parameterList.add(param);
            this.parameterMap.put(param.paramName, param);
        }
        this.numParameters = this.parameterList.size();
    }

    CallableStatement.CallableStatementParamInfo(ResultSet paramTypesRs) throws SQLException {
        boolean hadRows = paramTypesRs.last();
        this.nativeSql = ((PreparedQuery)CallableStatement.this.query).getOriginalSql();
        this.dbInUse = CallableStatement.this.getCurrentDatabase();
        this.isFunctionCall = CallableStatement.this.callingStoredFunction;
        if (hadRows) {
            this.numParameters = paramTypesRs.getRow();
            this.parameterList = new ArrayList<CallableStatement.CallableStatementParam>(this.numParameters);
            this.parameterMap = new HashMap<String, CallableStatement.CallableStatementParam>(this.numParameters);
            paramTypesRs.beforeFirst();
            this.addParametersFromDBMD(paramTypesRs);
        } else {
            this.numParameters = 0;
        }
        if (this.isFunctionCall) {
            ++this.numParameters;
        }
    }

    private void addParametersFromDBMD(ResultSet paramTypesRs) throws SQLException {
        int i = 0;
        while (paramTypesRs.next()) {
            int inOutModifier;
            String paramName = paramTypesRs.getString(4);
            switch (paramTypesRs.getInt(5)) {
                case 1: {
                    inOutModifier = 1;
                    break;
                }
                case 2: {
                    inOutModifier = 2;
                    break;
                }
                case 4: 
                case 5: {
                    inOutModifier = 4;
                    break;
                }
                default: {
                    inOutModifier = 0;
                }
            }
            boolean isOutParameter = false;
            boolean isInParameter = false;
            if (i == 0 && this.isFunctionCall) {
                isOutParameter = true;
                isInParameter = false;
            } else if (inOutModifier == 2) {
                isOutParameter = true;
                isInParameter = true;
            } else if (inOutModifier == 1) {
                isOutParameter = false;
                isInParameter = true;
            } else if (inOutModifier == 4) {
                isOutParameter = true;
                isInParameter = false;
            }
            int jdbcType = paramTypesRs.getInt(6);
            String typeName = paramTypesRs.getString(7);
            int precision = paramTypesRs.getInt(8);
            int scale = paramTypesRs.getInt(10);
            short nullability = paramTypesRs.getShort(12);
            CallableStatement.CallableStatementParam paramInfoToAdd = new CallableStatement.CallableStatementParam(paramName, i++, isInParameter, isOutParameter, jdbcType, typeName, precision, scale, nullability, inOutModifier);
            this.parameterList.add(paramInfoToAdd);
            this.parameterMap.put(paramName, paramInfoToAdd);
        }
    }

    protected void checkBounds(int paramIndex) throws SQLException {
        int localParamIndex = paramIndex - 1;
        if (paramIndex < 0 || localParamIndex >= this.numParameters) {
            throw SQLError.createSQLException(Messages.getString("CallableStatement.11", new Object[]{paramIndex, this.numParameters}), "S1009", CallableStatement.this.getExceptionInterceptor());
        }
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    CallableStatement.CallableStatementParam getParameter(int index) {
        return this.parameterList.get(index);
    }

    CallableStatement.CallableStatementParam getParameter(String name) {
        return this.parameterMap.get(name);
    }

    @Override
    public String getParameterClassName(int arg0) throws SQLException {
        try {
            String mysqlTypeName = this.getParameterTypeName(arg0);
            MysqlType mysqlType = MysqlType.getByName(mysqlTypeName);
            switch (mysqlType) {
                case YEAR: {
                    if (!CallableStatement.this.session.getPropertySet().getBooleanProperty(PropertyKey.yearIsDateType).getValue().booleanValue()) {
                        return Short.class.getName();
                    }
                    return mysqlType.getClassName();
                }
            }
            return mysqlType.getClassName();
        }
        catch (CJException cJException) {
            throw SQLExceptionsMapping.translateException(cJException);
        }
    }

    @Override
    public int getParameterCount() throws SQLException {
        try {
            if (this.parameterList == null) {
                return 0;
            }
            return this.parameterList.size();
        }
        catch (CJException cJException) {
            throw SQLExceptionsMapping.translateException(cJException);
        }
    }

    @Override
    public int getParameterMode(int arg0) throws SQLException {
        try {
            this.checkBounds(arg0);
            return this.getParameter((int)(arg0 - 1)).inOutModifier;
        }
        catch (CJException cJException) {
            throw SQLExceptionsMapping.translateException(cJException);
        }
    }

    @Override
    public int getParameterType(int arg0) throws SQLException {
        try {
            this.checkBounds(arg0);
            return this.getParameter((int)(arg0 - 1)).jdbcType;
        }
        catch (CJException cJException) {
            throw SQLExceptionsMapping.translateException(cJException);
        }
    }

    @Override
    public String getParameterTypeName(int arg0) throws SQLException {
        try {
            this.checkBounds(arg0);
            return this.getParameter((int)(arg0 - 1)).typeName;
        }
        catch (CJException cJException) {
            throw SQLExceptionsMapping.translateException(cJException);
        }
    }

    @Override
    public int getPrecision(int arg0) throws SQLException {
        try {
            this.checkBounds(arg0);
            return this.getParameter((int)(arg0 - 1)).precision;
        }
        catch (CJException cJException) {
            throw SQLExceptionsMapping.translateException(cJException);
        }
    }

    @Override
    public int getScale(int arg0) throws SQLException {
        try {
            this.checkBounds(arg0);
            return this.getParameter((int)(arg0 - 1)).scale;
        }
        catch (CJException cJException) {
            throw SQLExceptionsMapping.translateException(cJException);
        }
    }

    @Override
    public int isNullable(int arg0) throws SQLException {
        try {
            this.checkBounds(arg0);
            return this.getParameter((int)(arg0 - 1)).nullability;
        }
        catch (CJException cJException) {
            throw SQLExceptionsMapping.translateException(cJException);
        }
    }

    @Override
    public boolean isSigned(int arg0) throws SQLException {
        try {
            this.checkBounds(arg0);
            return false;
        }
        catch (CJException cJException) {
            throw SQLExceptionsMapping.translateException(cJException);
        }
    }

    Iterator<CallableStatement.CallableStatementParam> iterator() {
        return this.parameterList.iterator();
    }

    int numberOfParameters() {
        return this.numParameters;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        try {
            CallableStatement.this.checkClosed();
            return iface.isInstance(this);
        }
        catch (CJException cJException) {
            throw SQLExceptionsMapping.translateException(cJException);
        }
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        try {
            try {
                return iface.cast(this);
            }
            catch (ClassCastException cce) {
                throw SQLError.createSQLException(Messages.getString("Common.UnableToUnwrap", new Object[]{iface.toString()}), "S1009", CallableStatement.this.getExceptionInterceptor());
            }
        }
        catch (CJException cJException) {
            throw SQLExceptionsMapping.translateException(cJException);
        }
    }
}
