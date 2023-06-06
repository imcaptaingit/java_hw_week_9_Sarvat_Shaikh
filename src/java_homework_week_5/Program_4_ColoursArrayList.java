package java_homework_week_5;

import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colors (string) and
 * printout the collection using for each loop.
 */
public class Program_4_ColoursArrayList {

    public static void main(String[] args) {

        ArrayList<String> colorlist = new ArrayList ();
        colorlist.add("Purple");
        colorlist.add("Cyan");
        colorlist.add("Pink");
        colorlist.add("Violet");
        colorlist.add("Black");
        colorlist.add("Sienna");
        colorlist.add("Turquoise");
        colorlist.add("Gold");

        for (String colourList:colorlist) {
            System.out.println(colourList + " , ");

        }
    }
}
