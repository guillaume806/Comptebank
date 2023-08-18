package org.example.model;

public class Operate {

    private int id;
    private double Rising;
    private enum OperationEnum;


    public Operate(int id, double rising) {
        this.id = id;
        Rising = rising;
    }

    public double getRising() {
        return Rising;
    }

    public void setRising(double rising) {
        Rising = rising;
    }
}
