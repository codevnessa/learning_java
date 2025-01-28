package ContaBancaria.;

import java.util.Scanner;

public class InputUtils {
    private static final Scanner scanner = new Scanner(System.in);

    // Method to read an integer
    public static int readInt(String message) {
        System.out.print(message);
        return scanner.nextInt();
    }

    // Method to read a string
    public static String readString(String message) {
        System.out.print(message);
        scanner.nextLine(); // Consume the pending newline
        return scanner.nextLine();
    }

    // Method to read a double
    public static double readDouble(String message) {
        System.out.print(message);
        return scanner.nextDouble();
    }

    // Method to read a character (y/n)
    public static char readChar(String message) {
        System.out.print(message);
        return scanner.next().charAt(0);
    }

    // Method to close the scanner
    public static void closeScanner() {
        scanner.close();
    }
}