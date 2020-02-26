package com.epam.Interest;

import java.io.Serializable;

public class SimpleInterest implements Serializable {
    long principle;
    double rate;
    int time;
    double SI;



    public long getPrinciple() {
        return principle;
    }

    public void setPrinciple(long principle) {
        this.principle = principle;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public double getSI() {
        return SI;
    }

    public void setSI(double SI) {
        this.SI = SI;
    }

    public double calculateInterest()
    {
        SI = (principle*rate*time)/100;
        return SI;
    }
}
