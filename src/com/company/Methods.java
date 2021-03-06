package com.company;

public class Methods<T extends Number> {
    //search max value
    public static <T> T Max(T ... args){
        T result = args[0];
        for (int i = 1; i < args.length; i++) {
            if ((Double)result < (Double)args[i]) result = args[i];
        }
        return result;
    }
    //search min value
    public static <T> T Min(T... args){
        T result = args[0];
        for (int i = 1; i < args.length; i++) {
            if ((Double)result > (Double)args[i]) result = args[i];
        }
        return result;
    }
    //get average
    public static <T> double Avg(T ... args){
        if(args.length == 0) return 0;
        double sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += (double)args[i];
        }
        return sum/args.length;
    }
    //sort array
    public static <T> void InsertSort(T[] array, boolean increase) {
        int size = array.length;
        for (int i = 1; i < size; i++) {
            Double tmp = (Double) array[i];
            int j = i - 1;
            for (; j >= 0 && (increase ? ((Double)array[j] > tmp) : ((Double)array[j] < tmp)); j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = (T) tmp;
        }
    }
    public static <T> void InsertSort(T[] array) {
        InsertSort(array, true);
    }
}
