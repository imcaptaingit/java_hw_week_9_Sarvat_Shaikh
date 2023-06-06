package java_homework_week_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Program_6_RetrieveArrayListGivenIndex {

    public static void main(String[] args) {

        ArrayList<String> CarList = new ArrayList();
        CarList.add("Ferrari");
        CarList.add("Bugatti");
        CarList.add("Mercedes Benz");
        CarList.add("Pagani Hayura");
        CarList.add("Lamborghini");
        CarList.add("Range Rover");
        CarList.add("Jaguar");
        CarList.add("Audi");
        System.out.println(CarList);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number to choose from the index : ");
        int index =scanner.nextInt();
        if (index< CarList.size()){
            System.out.println(CarList.get(index));
        } else {
            System.out.println(" ! Invalid Input by the User !");
        }
        scanner.close();
    }
}
