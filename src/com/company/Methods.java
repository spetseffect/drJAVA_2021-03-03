package com.company;

public class Methods<T extends Number> {
    public T Max(T ... args){
        T result = args[0];
        for (int i = 1; i < args.length; i++) {
            if ((Double)result < (Double)args[i]) result = args[i];
        }
        return result;
    }
    public T Min(T... args){
        T result = args[0];
        for (int i = 1; i < args.length; i++) {
            if ((Double)result > (Double)args[i]) result = args[i];
        }
        return result;
    }
    public double Avg(T ... args){
        if(args.length == 0) return 0;
        double sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += (double)args[i];
        }
        return sum/args.length;
    }
}
