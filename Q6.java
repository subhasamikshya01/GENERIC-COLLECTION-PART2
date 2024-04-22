import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Create a TreeSet of Integer type
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Adding some elements to the TreeSet
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);

        // (a) Display the TreeSet
        System.out.println("TreeSet elements: " + treeSet);

        // (b) Ask the user to enter a number and search if it is present in the TreeSet
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a number to search in the TreeSet: ");
        int number = scanner.nextInt();
        boolean isPresent = treeSet.contains(number);
        System.out.println("Number " + number + " is present in the TreeSet: " + isPresent);

        // (c) Remove an element from the TreeSet
        System.out.print("\nEnter a number to remove from the TreeSet: ");
        int numberToRemove = scanner.nextInt();
        boolean removed = treeSet.remove(numberToRemove);
        if (removed) {
            System.out.println("Number " + numberToRemove + " removed from the TreeSet.");
        } else {
            System.out.println("Number " + numberToRemove + " not found in the TreeSet.");
        }

        // Display the updated TreeSet
        System.out.println("Updated TreeSet elements: " + treeSet);
    }
}
