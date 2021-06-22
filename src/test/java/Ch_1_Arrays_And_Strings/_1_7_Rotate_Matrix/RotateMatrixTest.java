package Ch_1_Arrays_And_Strings._1_7_Rotate_Matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RotateMatrixTest {
    @Test
    void checkIfMatrixIsRotated() {
        int[][] one = {{1, 2}, {3, 4}};
        int[][] two = {{3, 1}, {4, 2}};
        assertArrayEquals(two, RotateMatrix.rotate(one));

        one = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        two = new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        assertArrayEquals(two, RotateMatrix.rotate(one));

        one = new int[][]{{1}};
        two = new int[][]{{1}};
        assertArrayEquals(two, RotateMatrix.rotate(one));
    }

}