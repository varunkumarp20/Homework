public class code8 {
    public static void main(String[] args) {
  
        int[][] matrixA = { {1, 2, 3}, {4, 5, 6} };
        int[][] matrixB = { {7, 8, 9}, {1, 2, 3} };

        int[][] sum = new int[2][3];

        for (int i = 0; i < 2; i++) { 
            for (int j = 0; j < 3; j++) { 
                sum[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        System.out.println("Sum of matrices:");
        for (int[] row : sum) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
