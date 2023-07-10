/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.util;

public static class DnsSrv.SrvRecord
implements Comparable<DnsSrv.SrvRecord> {
    private final int priority;
    private final int weight;
    private final int port;
    private final String target;

    public static DnsSrv.SrvRecord buildFrom(String srvLine) {
        String[] srvParts = srvLine.split("\\s+");
        if (srvParts.length == 4) {
            int priority = Integer.parseInt(srvParts[0]);
            int weight = Integer.parseInt(srvParts[1]);
            int port = Integer.parseInt(srvParts[2]);
            String target = srvParts[3].replaceFirst("\\.$", "");
            return new DnsSrv.SrvRecord(priority, weight, port, target);
        }
        return null;
    }

    public DnsSrv.SrvRecord(int priority, int weight, int port, String target) {
        this.priority = priority;
        this.weight = weight;
        this.port = port;
        this.target = target;
    }

    public int getPriority() {
        return this.priority;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getPort() {
        return this.port;
    }

    public String getTarget() {
        return this.target;
    }

    public String toString() {
        return String.format("{\"Priority\": %d, \"Weight\": %d, \"Port\": %d, \"Target\": \"%s\"}", this.getPriority(), this.getWeight(), this.getPort(), this.getTarget());
    }

    @Override
    public int compareTo(DnsSrv.SrvRecord o) {
        int priorityDiff = this.getPriority() - o.getPriority();
        return priorityDiff == 0 ? this.getWeight() - o.getWeight() : priorityDiff;
    }
}
