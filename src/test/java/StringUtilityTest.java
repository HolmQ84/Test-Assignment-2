import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilityTest {

    @Test
    void reverseStringTestWithABC() {
        assertEquals("cBa", new StringUtility().reverse("aBc"));
    }

    @Test
    void reverseStringTestWithEFG() {
        assertEquals("gFe", new StringUtility().reverse("eFg"));
    }

    @Test
    void reverseStringTestWithABCDEFG() {
        assertEquals("gFeDcBa", new StringUtility().reverse("aBcDeFg"));
    }

    @Test
    void capitalizeStringWithABC() {
        assertEquals("ABC", new StringUtility().capitalize("abc"));
    }

    @Test
    void capitalizeStringWithEFG() {
        assertEquals("EFG", new StringUtility().capitalize("efg"));
    }

    @Test
    void capitalizeStringWithABCDEFG() {
        assertEquals("ABCDEFG", new StringUtility().capitalize("abcdefg"));
    }

    @Test
    void lowerCaseStringWithABC() {
        assertEquals("abc", new StringUtility().lowercase("aBc"));
    }

    @Test
    void lowerCaseStringWithEFG() {
        assertEquals("efg", new StringUtility().lowercase("EfG"));
    }

    @Test
    void lowerCaseStringWithABCDEFG() {
        assertEquals("abcdefg", new StringUtility().lowercase("aBcDEfG"));
    }
}
