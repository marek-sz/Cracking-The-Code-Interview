package Ch_1_Arrays_And_Strings._1_6_String_Compression;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCompTest {
    @Test
    void shouldReplaceOccurrencesOfTheSameCharacters() {
        assertEquals("a2b1c5a3", StringComp.compress("aabcccccaaa"));
        assertEquals("a3b3a3", StringComp.compress("aaabbbaaa"));
        assertEquals("a", StringComp.compress("a"));
    }
}