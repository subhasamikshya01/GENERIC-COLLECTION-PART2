import java.util.HashSet;

public class SmallestMissingPositiveNumberFinder {
    public static void main(String[] args) {
        int[] array = {1, 3, 6, 4, 5, 2, 10, 8, 9};

        int smallestMissingPositive = findSmallestMissingPositive(array);

        System.out.println("Smallest missing positive number: " + smallestMissingPositive);
    }

    public static int findSmallestMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        // Add all elements of the array to the set
        for (int num : nums) {
            set.add(num);
        }

        // Check for the smallest positive number missing from 1 to 10
        for (int i = 1; i <= 10; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        // If no positive number is missing from 1 to 10, return 11
        return 11;
    }
}
