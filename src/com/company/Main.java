package com.company;

public class Main {
    public static void main(String[] args) {
        Integer[] arr=new Integer[]{78,4751,683,647,58,0,-2};
        System.out.print("Array: ");
        Methods.OutputToConsole(arr,", ");

        System.out.print("Search maximum value: " + Methods.Max(arr) + "\n");

        System.out.print("Search minimum value: " + Methods.Min(arr) + "\n");

        try {
            System.out.print("Average value: " + Methods.Avg(arr) + "\n");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Search item's index of value 683 in sorted array by binary method: " +
                Methods.BinSearch(arr,683));
        System.out.print("Sort array by increasing direction: ");
        Methods.OutputToConsole(arr,", ");

        System.out.print("Sort array by decreasing direction: ");
        Methods.InsertSort(arr,false);
        Methods.OutputToConsole(arr,", ");
    }
}
