package Ch_1_Arrays_And_Strings._1_2_Check_Permutations;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PermCheckerTest {

    @Test
    public void checkPermutations() {
        assertTrue(PermChecker.checkIfStringsArePermutable("abba", "baab"));
    }
}