package com.ict4dev.benildo.unitconverter.model;

public class Unit {

    private int intputId;
    private int outputId;
    private float value;

    public Unit(int intputId, int outputId, float value) {
        this.intputId = intputId;
        this.outputId = outputId;
        this.value = value;
    }

    public int getIntputId() {
        return intputId;
    }

    public void setIntputId(int intputId) {
        this.intputId = intputId;
    }

    public int getOutputId() {
        return outputId;
    }

    public void setOutputId(int outputId) {
        this.outputId = outputId;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}
