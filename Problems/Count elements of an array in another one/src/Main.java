import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[] countOccurrences(int[] first, int[] second) {
        // write your code here
        int[] count = new int[first.length];
        int k = 0;
        for (int i : first) {
            for (int j : second) {
                if (i == j) {
                    count[k]++;
                }
            }
            k++;
        }
        return count;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int[] first = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        final int[] second = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        final String result = Arrays.toString(countOccurrences(first, second))
                .replace(", ", " ")
                .replace("[", "")
                .replace("]", "");
        System.out.println(result);
    }
}