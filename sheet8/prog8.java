mport java.util.*;

public class PatternPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        String[] line = new String[n];

        for (int i = 0; i < n; i++) {
            int num = i + 1;
            char ch = (char) ('A' + i);
            line[i] = num + "" + ch;
        }

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // Print in normal order
                for (int j = 0; j < n; j++) {
                    System.out.print(line[j] + " ");
                }
            } else {
                // Print in reverse order
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(line[j] + " ");
                }
            }
            System.out.println();
        }
    }
}
