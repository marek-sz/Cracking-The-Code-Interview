package Ch_1_Arrays_And_Strings._1_3_URLify;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class URLifyTest {
    @Test
    void shouldReplaceAllSpacesWith20() {
        assertEquals("Mr%20John%20Smith", URLify.replace("Mr  John     Smith  "));
        assertEquals("Mr%20John%20Smith", URLify.replace("   Mr  John     Smith  "));
        assertEquals("Mr%20John%20Smith", URLify.replace(" Mr John Smith"));
    }
}