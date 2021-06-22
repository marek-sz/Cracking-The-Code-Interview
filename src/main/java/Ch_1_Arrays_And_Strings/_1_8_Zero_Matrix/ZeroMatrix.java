package Ch_1_Arrays_And_Strings._1_8_Zero_Matrix;

public class ZeroMatrix {

    public static int[][] zeroRowAndColumn(int[][] matrix) {
        int length = matrix.length;
        for (int row = 0; row < length; row++) {
            for (int column = 0; column < length; column++) {
                if (matrix[row][column] == 0) {
                    zeroRow(matrix, row);
                    zeroColumn(matrix, column);
                    return matrix;
                }
            }
        }
        return matrix;
    }

    private static void zeroRow(int[][] matrix, int row) {
        int rowLength = matrix[row].length;
        for (int i = 0; i < rowLength; i++) {
            matrix[row][i] = 0;
        }
    }

    private static void zeroColumn(int[][] matrix, int column) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][column] = 0;
        }
    }
}