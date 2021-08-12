public class PrintMatrixInReverseOrder {
    public static void main(String[] args) {
        int[][] matrix = {{10, 20, 30}, {11, 22, 33}, {40, 50, 60}};
        for (int i = 0; i<matrix.length; i++) {
            for (int j = matrix.length-1;j>=0 ;j--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }

    }
}


