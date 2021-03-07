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
    public static <T> double Avg(T ... args) throws Exception{
        if(args.length == 0) throw new Exception("Array is empty.");
        else {
            double sum = 0;
            for (int i = 0; i < args.length; i++) {
                sum += (double) args[i];
            }
            return sum / args.length;
        }
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
    //binary search
    public static <T> int BinSearch(T[] array, T value) {
        InsertSort(array);//if array not sorted
        int ind=array.length / 2;
        Double tmp = (Double) array[ind];
        Double s = (Double) value;
        int b = 0, e = array.length - 1;
        while(!tmp.equals(s) && b < e){
            if(tmp < s) e = ind-1;
            else b = ind + 1;
            ind = (b + e) / 2;
            tmp = (Double) array[ind];
        }
        return ind;
    }
}
