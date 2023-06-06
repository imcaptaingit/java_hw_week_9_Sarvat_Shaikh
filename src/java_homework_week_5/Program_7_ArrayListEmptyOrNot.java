package java_homework_week_5;

import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not.
 */
public class Program_7_ArrayListEmptyOrNot {

    public void isEmptyOrNot() {
        ArrayList<String> CarList = new ArrayList<>();
        CarList.add("Ferrari");
        CarList.add("Bugatti");
        CarList.add("Mercedes Benz");
        CarList.add("Pagani Huayra");
        CarList.add("Lamborghini");
        CarList.add("Porsche");
        CarList.add("Range Rover");
        CarList.add("Audi");
        System.out.println("Given Array List : " + CarList);
        if (CarList.isEmpty()) {
            System.out.println(" !! Given Array List is Empty !! ");
        } else {
            System.out.println("!! Given Array List is Not Empty !!");
        }
    }

    public static void main(String[] args) {
        Program_7_ArrayListEmptyOrNot obj = new Program_7_ArrayListEmptyOrNot();
        obj.isEmptyOrNot();
    }
}
