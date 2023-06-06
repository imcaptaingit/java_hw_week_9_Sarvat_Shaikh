package java_homework_week_5;
/**
 * Write a Java program to reverse an array of integer values.
 */

import java.util.Arrays;

public class Program_3_ReverseArray {

    public static void main(String[] args) {
        int[] array = new int[]{32, 78, 98, 68, 58, 45};
        System.out.println("Actual Array " + Arrays.toString(array));
        Program_3_ReverseArray obj = new Program_3_ReverseArray();
        obj.reverseAnArray(array);

    }

    public void reverseAnArray(int[] list) {

        for (int i = 0; i < list.length / 2; i++) {
            int temp = list[i];
            list[i] = list[list.length - 1 - i];
            list[list.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(list));
    }

}
