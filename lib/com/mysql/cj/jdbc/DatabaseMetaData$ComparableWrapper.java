/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.jdbc;

protected class DatabaseMetaData.ComparableWrapper<K, V>
implements Comparable<DatabaseMetaData.ComparableWrapper<K, V>> {
    K key;
    V value;

    public DatabaseMetaData.ComparableWrapper(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

    @Override
    public int compareTo(DatabaseMetaData.ComparableWrapper<K, V> other) {
        return ((Comparable)this.getKey()).compareTo(other.getKey());
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DatabaseMetaData.ComparableWrapper)) {
            return false;
        }
        K otherKey = ((DatabaseMetaData.ComparableWrapper)obj).getKey();
        return this.key.equals(otherKey);
    }

    public int hashCode() {
        assert (false) : "hashCode not designed";
        return 0;
    }

    public String toString() {
        return "{KEY:" + this.key + "; VALUE:" + this.value + "}";
    }
}
