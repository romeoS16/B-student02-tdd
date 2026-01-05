package de.ba.experiment.palindrome;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeCheckerTest {

    // In dieser Gruppe arbeiten Sie mit TDD und dürfen zusätzlich KI nutzen.
    // Wichtig: Schreiben Sie zuerst eigene Testfälle OHNE KI,
    // bevor Sie eine KI um Hilfe bitten (siehe README.md).

    @Test
    public void simpleLowercasePalindrome_returnsTrue() {
        boolean result = PalindromeChecker.isPalindrome("anna");
        assertTrue(result);
    }
    @Test
    public void isPalindromeTest_emptyString() {
        boolean result = PalindromeChecker.isPalindrome("");
        assertTrue(result);
    }
    @Test
    public void isPalindromeTest_nullTest() {
        boolean result = PalindromeChecker.isPalindrome(null);
        assertFalse(result);
    }
    @Test
    public void isPalindromeTest_lowerAndUpperCaseTest() {
        boolean result = PalindromeChecker.isPalindrome("oTtO");
        assertTrue(result);
    }
    @Test
    public void isPalindromeTest_ignoreSpace() {
        boolean result = PalindromeChecker.isPalindrome("ot  to");
        assertTrue(result);
    }
    @Test
    public void isPalindromeTest_considerNumbers() {
        boolean result = PalindromeChecker.isPalindrome("o2tt2o");
        assertTrue(result);
    }
    @Test
    public void isPalindromeTest_considerPunctuationMarks() {
        boolean result = PalindromeChecker.isPalindrome("o,.tt.,o");
        assertTrue(result);
    }



    // TODO: weitere Testfälle ergänzen
}
