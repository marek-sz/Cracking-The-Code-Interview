package Ch_1_Arrays_And_Strings._1_7_Rotate_Matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RotateMatrixTest {
    @Test
    void checkIfMatrixIsRotated() {
        int[][] one = {{1, 2}, {3, 4}};
        int[][] two = {{3, 1}, {4, 2}};
        assertArrayEquals(two, RotateMatrix.rotate(one));
    }
}