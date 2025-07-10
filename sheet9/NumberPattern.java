public class NumberPattern {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 4;
        int[][] matrix = new int[rows][cols];
        
        int num = 1;

        // Fill column-wise
        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < rows; row++) {
                matrix[row][col] = num++;
            }
        }

        // Print row-wise
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.printf("%-5d", matrix[row][col]);
            }
            System.out.println();
        }
    }
}
