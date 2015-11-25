package org.roben.sample.arrays;

public class BubbleSort {

    public static void main(String args[]) {
        BubbleSort b = new BubbleSort();
        String input = "hello world";
        input = input.replace(" ", "");
        char[] array = input.toCharArray();
        array = b.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public char[] sort(char array[]) {
        int l = array.length;
        int k;
        for (int m = l; m > 0; m--) {
            for (int i = 0; i < m - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    swap(i, k, array);
                }
            }
        }
        return array;
    }

    public static void swap(int a, int b, char array[]) {
        char temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

}
