package org.levelup.reflection;

public class RandomIntegerExample {
    @RandomInteger(min=10,max = 18)
    private int value;
    @RandomInteger (min=1)
    private int valueWithoutMax;
    private int valueWithoutAnnotation;
    public RandomIntegerExample(){}
    @Override
    public String toString(){
        return "RandomIntegerExample{"+
                "value="+value+
                ", valueWithoutMax="+valueWithoutMax+
                ", valueWithoutAnnotation="+valueWithoutAnnotation+"}";

    }
}
