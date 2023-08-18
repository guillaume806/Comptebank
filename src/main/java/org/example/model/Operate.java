package org.example.model;

public class Operate {

    private int id;
    private double Rising;

    private int sessionID;
    private OperateEnum type;

    public Operate(double rising, int sessionID, OperateEnum type) {
        Rising = rising;
        this.sessionID = sessionID;
        this.type = type;
    }

    public int getId(int anInt) {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRising() {
        return Rising;
    }

    public void setRising(double rising) {
        Rising = rising;
    }

    public int getSessionID() {
        return sessionID;
    }

    public void setSessionID(int sessionID) {
        this.sessionID = sessionID;
    }

    public OperateEnum getType() {
        return type;
    }

    public void setType(OperateEnum type) {
        this.type = type;
    }
}
