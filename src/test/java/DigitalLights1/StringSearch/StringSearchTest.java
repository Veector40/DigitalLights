package DigitalLights1.StringSearch;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringSearchTest {
    @Test
    public void simpleSearchTest() {
        SimpleSearch ssb = new SimpleSearch();
        assertEquals(1, ssb.positionOf("bcadef", "abcadefgha"));
    }
    @Test
    public void KnuthMorrisPrattSearchTest() {
        KnuthMorrisPrattSearch kmp = new KnuthMorrisPrattSearch();
        assertEquals(4, kmp.positionOf("abc", "abbcabc"));
    }
}
