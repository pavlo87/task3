package com.OneDimensionalArray;

public class Main {

    public static void main(String[] args) {
        int[] array ={12, 1, 5, 7, 13, -1, -5};
        int sum = 0;
        int max = array[0], min = array[0];
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
            if (max < array[i])
                max = array[i];
            if (min > array[i])
                min = array[i];
            sum = max + min;
        }
        System.out.println("сума ="+sum);
    }
}
