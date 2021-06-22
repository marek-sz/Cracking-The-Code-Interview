package Ch_1_Arrays_And_Strings._1_8_Zero_Matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ZeroMatrixTest {
    @Test
    void whenOneOfTheElementsIsZeroShouldZeroCorrespondingRowAndColumn() {
        int[][] one = {{0, 1, 1},
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}};
        int[][] two = {{0, 0, 0},
                {0, 1, 1},
                {0, 1, 1},
                {0, 1, 1}};
        assertArrayEquals(two, ZeroMatrix.zeroRowAndColumn(one));

        int[][] three = {{1, 1}, {1, 0}};
        int[][] four = {{1, 0}, {0, 0}};
        assertArrayEquals(four, ZeroMatrix.zeroRowAndColumn(three));
    }

}