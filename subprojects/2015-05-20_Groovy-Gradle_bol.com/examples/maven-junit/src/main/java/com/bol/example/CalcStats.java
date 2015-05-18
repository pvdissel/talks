package com.bol.example;

public class CalcStats {

    private int minimum;
    private int maximum;
    private int count;
    private double average;

    public CalcStats(int minimum, int maximum, int count, double average) {
        this.minimum = minimum;
        this.maximum = maximum;
        this.count = count;
        this.average = average;
    }

    public int getMinimum() {
        return minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public int getCount() {
        return count;
    }

    public double getAverage() {
        return average;
    }
}
