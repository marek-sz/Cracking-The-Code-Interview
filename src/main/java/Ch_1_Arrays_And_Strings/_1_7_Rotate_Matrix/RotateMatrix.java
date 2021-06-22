package Ch_1_Arrays_And_Strings._1_7_Rotate_Matrix;

public class RotateMatrix {
    public static int[][] rotate(int[][] picture) {
        int[][] rotated = new int[picture.length][picture.length];
        int desc = picture.length - 1;

        for (int i = 0; i < rotated.length; i++) {
            for (int j = 0; j < rotated.length; j++) {
                rotated[i][j] = picture[desc--][i];
            }
            desc = picture.length - 1;
        }
        return rotated;
    }
}