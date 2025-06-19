// Java program to demonstrate ArrayList

import java.util.ArrayList;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Create ArrayList with Double numbers
        ArrayList<Double> list = new ArrayList<>();

        // Adding elements to list
        list.add(2.0);
        list.add(3.1);
        list.add(4.7);
        list.add(5.8);
        list.add(1.1);
        list.add(4.9);

        // Printing list to console
        System.out.println(list);

        // Getting and printing element number 3 from list
        if (list.size() > 3){
            System.out.println("Element 3 is: " + list.get(3));
        } else {
            System.out.println("Elements 3 does not exist");
        }


        // Getting and printing element number 5 from list
        if (list.size() > 5){
            System.out.println("Element 5 is: " + list.get(5));
        } else {
            System.out.println("Elements 5 does not exist");
        }


        // Getting and printing element number 8 from list
        if (list.size() > 8){
            System.out.println("Element 8 is: " + list.get(8));
        } else {
            System.out.println("Elements 8 does not exist");
        }


    }
}