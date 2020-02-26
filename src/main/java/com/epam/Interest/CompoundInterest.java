package com.epam.Interest;

public class CompoundInterest extends SimpleInterest {
    CompoundInterest(long p, double r, int t )
    {
        setPrinciple(p);
        setRate(r);
        setTime(t);
    }
    public double interest()
    {
        double ci = principle*(Math.pow(1+rate/100,time));
        return ci;
    }
}
