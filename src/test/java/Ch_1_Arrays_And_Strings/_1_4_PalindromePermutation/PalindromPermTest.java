package Ch_1_Arrays_And_Strings._1_4_PalindromePermutation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromPermTest {
    @Test
    public void shouldBePalindrome() {
        assertTrue(PalindromPerm.checkIfPalindrome("Tact Coa"));
        //(permutations: "taco cat", "atco cta")

    }
}