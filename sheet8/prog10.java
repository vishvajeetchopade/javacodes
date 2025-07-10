import java.util.Scanner;

public class SymbolPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        // Define the repeating symbol pattern
        char[] symbols = {'#', '$', '@'};

        // Loop through rows
        for (int i = 0; i < n; i++) {
            char symbol = symbols[i % 3];  // Cycle through #, $, @
            // Print n times in the row
            for (int j = 0; j < n; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}
