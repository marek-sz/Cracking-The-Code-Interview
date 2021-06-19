package Ch_1_Arrays_And_Strings._1_2_Check_Permutations;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PermCheckerTest {

    @Test
    public void checkPermutations() {
        assertTrue(PermChecker.checkIfStringsArePermutable("abba", "baab"));
        assertTrue(PermChecker.checkIfStringsArePermutable("Aaa", "aAa"));
        assertTrue(PermChecker.checkIfStringsArePermutable("1122  cc", "1c1c  22"));
    }
}