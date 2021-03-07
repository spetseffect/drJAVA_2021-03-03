package com.company;

public class Methods<T extends Number> {
    //search max value
    public static <T> T Max(T ... args){
        T result = args[0];
        for (int i = 1; i < args.length; i++) {
            if (Convert(result) < Convert(args[i])) result = args[i];
        }
        return result;
    }
    //search min value
    public static <T> T Min(T... args){
        T result = args[0];
        for (int i = 1; i < args.length; i++) {
            if (Convert(result) > Convert(args[i])) result = args[i];
        }
        return result;
    }
    //get average
    public static <T> double Avg(T ... args) throws Exception{
        if(args.length == 0) throw new Exception("Array is empty.");
        else {
            var sum = 0.0;
            for (int i = 0; i < args.length; i++) {
                sum += Convert(args[i]);
            }
            return sum / args.length;
        }
    }
    //sort array
    public static <T> void InsertSort(T[] array, boolean increase) {
        String type=array[0].getClass().getTypeName();
        int size = array.length;
        for (int i = 1; i < size; i++) {
            var tmp = Convert(array[i]);
            int j = i - 1;
            for (; j >= 0 && (increase ? (Convert(array[j]) > tmp) : (Convert(array[j]) < tmp)); j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = UnConvert(tmp,type);
        }
    }
    public static <T> void InsertSort(T[] array) {
        InsertSort(array, true);
    }
    //binary search
    public static <T> int BinSearch(T[] array, T value) {
        InsertSort(array);//if array not sorted
        int ind=(array.length - 1) / 2;
        var tmp = Convert(array[ind]);
        var s = Convert(value);
        int b = 0, e = array.length - 1;
        while(tmp != s && b < e){
            if(s < tmp) e = ind;
            else b = ind;
            ind = (b + e) / 2;
            tmp = Convert(array[ind]);
        }
        if(b == e) return -1;
        return ind;
    }
    //output array to console
    public static <T> void OutputToConsole(T[] array, String margin) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
            if (i < size - 1) { System.out.print(margin); }
        }
        System.out.println();
    }
    //convert input number to 'double'
    private static <T> double Convert(T value){
        if(value instanceof Byte) return (double) ((Byte) value).byteValue();
        else if(value instanceof Short) return (double) ((Short) value).shortValue();
        else if(value instanceof Integer) return (double) ((Integer) value).intValue();
        else if(value instanceof Long) return (double) ((Long) value).longValue();
        else if(value instanceof Float) return (double) ((Float) value).floatValue();
        else return ((Double) value).doubleValue();
    }
    //convert 'double' value to the number 'T'
    private static <T> T UnConvert(double value, String className){
        if(className == "java.lang.Byte") return (T) new Byte((byte)value);
        else if(className == "java.lang.Short") return (T) new Short((short) value);
        else if(className == "java.lang.Integer") return (T) new Integer((int) value);
        else if(className == "java.lang.Long") return (T) new Long((long) value);
        else if(className == "java.lang.Float") return (T) new Float((float) value);
        else return (T) new Double((double) value);
    }
}
