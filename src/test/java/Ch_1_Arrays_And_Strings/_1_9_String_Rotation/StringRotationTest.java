package Ch_1_Arrays_And_Strings._1_9_String_Rotation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class StringRotationTest {
    @Test
    void checkIfStringOneIsSubstringOfStringTwo() {
        assertTrue(StringRotation.isSubstring("waterbottle", "erbottlewat"));
    }
}