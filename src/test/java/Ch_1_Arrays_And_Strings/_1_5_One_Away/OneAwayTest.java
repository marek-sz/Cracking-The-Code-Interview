package Ch_1_Arrays_And_Strings._1_5_One_Away;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OneAwayTest {
    @Test
    void givenOneStringShouldTestIfSecondStringIsAfterOneEdit() {
        // consider three types of edits: insert a character, remove a character or replace a character
        assertFalse(OneAway.checkForEdits("", "pale"));
        assertFalse(OneAway.checkForEdits("ba", "pale"));
        assertFalse(OneAway.checkForEdits("bake", "pale"));
        assertFalse(OneAway.checkForEdits("pale", "bake"));
        assertTrue(OneAway.checkForEdits("pale", "pale"));
        assertTrue(OneAway.checkForEdits("pale", "ple"));
        assertTrue(OneAway.checkForEdits("pales", "pale"));
        assertTrue(OneAway.checkForEdits("pale", "bale"));
    }
}