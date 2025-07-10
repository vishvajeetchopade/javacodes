public class PatternPrinter {
    public static void main(String[] args) {
        int rows = 4;

        int odd1 = 1;
        int even1 = 2;
        int odd2 = 3;
        int even2 = 4;

        for (int i = 0; i < rows; i++) {
            System.out.printf("%-4d", odd1 * odd1);   // first column
            System.out.printf("%-4d", even1);         // second column
            System.out.printf("%-4d", odd2 * odd2);   // third column
            System.out.printf("%-4d", even2);         // fourth column
            System.out.println();

            odd1 += 4;
            even1 += 2;
            odd2 += 4;
            even2 += 2;
        }
    }
}
