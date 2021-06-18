package Ch_1_Arrays_And_Strings._1_1_Is_Unique;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsUniqueTest {
    @Test
    public void stringIsUnique() {
        assertTrue(IsUnique.isUnique("abcdef"));
        assertTrue(IsUnique.isUnique("abc def"));
        assertFalse(IsUnique.isUnique("aa"));
    }

}