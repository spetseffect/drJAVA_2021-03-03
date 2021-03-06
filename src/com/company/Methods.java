package com.company;

public class Methods<T extends Number> {
    public T Max(T ... args){
        T result = args[0];
        for (int i=1;i<args.length;i++) {
            if ((Double)result < (Double)args[i]) result = args[i];
        }
        return result;
    }
    public T Min(T ... args){
        T result = args[0];
        for (int i=1;i<args.length;i++) {
            if ((Double)result > (Double)args[i]) result = args[i];
        }
        return result;
    }
}
