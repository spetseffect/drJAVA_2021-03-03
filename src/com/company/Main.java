package com.company;

public class Main {
    public static void main(String[] args) {
        Integer[] arr=new Integer[]{78,4751,683,647,58,0};
        System.out.println(Methods.BinSearch(arr,1));
        //Methods.InsertSort(arr);
        Methods.OutputToConsole(arr,", ");
    }
}
