import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*

    This is a program for my computer science class that allows user to

    a. See a list of the HashMap
    b. Change a value in the HashMap based on the key
    c. Remove an element from the hashMap
    d. Exit the program

 */


class JavaHashmaps {

    public static void main(String[] args) {
        HashMap<String, String> hmap = new HashMap<String, String>();

        //default values
        hmap.put("1", "Frodo");
        hmap.put("2", "Bilbo");
        hmap.put("3", "Sam");
        hmap.put("4", "Aragorn");
        hmap.put("5", "Gandalf");
        hmap.put("6", "Legolas");


        //loops the program
        boolean b = true;
        while (b = true) {

            //menu
            System.out.println("\nThis is a program that allows you to rank favorite lord of the rings charachters");
            System.out.println("Hello, Please select a menu option:");
            System.out.println("1. Change values of hashmap");
            System.out.println("2. View hashmap ");
            System.out.println("3. Remove element from hashmap");
            System.out.println("4. Exit the program");

            //menu scanner
            Scanner scn = new Scanner(System.in);
            int MenuOption = scn.nextInt(); //Scan result

            //if user wants to change value
            if (MenuOption == 1) {

                System.out.println("\nWhat value would you like to change?");
                System.out.println(hmap);
                Scanner hmapOption = new Scanner(System.in);
                String hmapSelection = hmapOption.next(); //Scan result

                System.out.println("What would you like to change that to?");

                Scanner hmapOption2 = new Scanner(System.in);
                String hmapSelection2 = hmapOption2.next();

                hmap.put(hmapSelection, hmapSelection2);
                System.out.println(hmap);
            }

            //if user wants to see the hashmap
            else if (MenuOption == 2) {
                System.out.println(hmap);
            }

            //if user wants to remove an element from the hashmap
            else if(MenuOption == 3){
                System.out.println("\nPlease select an element to remove");
                System.out.println(hmap);
                Scanner removeElement = new Scanner(System.in);
                String removeElement1 = removeElement.next(); //Scan result
                String updatedHmap;
                updatedHmap =  hmap.remove(removeElement1);
                System.out.println(hmap+updatedHmap);

            }

            //if the user wants to exit the program
            else if(MenuOption == 4){
                System.out.println("\nThanks for using my program");
                System.exit(0);
            }
        }
    }
}