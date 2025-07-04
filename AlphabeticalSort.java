package xyz;
import java.util.Arrays;
import java.util.Scanner;

public class AlphabeticalSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] strings = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }

        Arrays.sort(strings);

        System.out.println("\nStrings in alphabetical order:");
        for (String str : strings) {
            System.out.println(str);
        }

        scanner.close();
    }
}