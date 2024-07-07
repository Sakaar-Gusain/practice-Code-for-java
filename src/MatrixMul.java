public class MatrixMul {
    public static void main(String[] args) {
        int a[][] = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int b[][] = { {10, 11, 12}, {13, 14, 15}, {16, 17, 18} };

        matrixMultiplication(a, b);
    }

    public static void matrixMultiplication(int a[][], int b[][]) {
        int rowCountA = a.length;
        int columnCountA = a[0].length;
        int rowCountB = b.length;
        int columnCountB = b[0].length;

        if (columnCountA != rowCountB) {
            System.out.println("Matrices cannot be multiplied!");
            return;
        }

        int product[][] = new int[rowCountA][columnCountB];

        for (int i = 0; i < rowCountA; i++) {
            for (int j = 0; j < columnCountB; j++) {
                product[i][j] = 0;
                for (int k = 0; k < columnCountA; k++) {
                    product[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        displayMatrix(product);
    }

    public static void displayMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}