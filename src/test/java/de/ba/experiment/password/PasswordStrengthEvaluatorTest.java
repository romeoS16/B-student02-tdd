package de.ba.experiment.password;

import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordStrengthEvaluatorTest {

    // In dieser Gruppe arbeiten Sie mit TDD und dürfen zusätzlich KI nutzen.
    // Wichtig: Schreiben Sie zuerst eigene Testfälle OHNE KI,
    // bevor Sie eine KI um Hilfe bitten (siehe README.md).

    @Test
    public void nullPassword_isWeak() {
        String result = PasswordStrengthEvaluator.evaluateStrength("ab1");
        assertEquals("WEAK", result);
    }
    //basic requirements
    @Test
    public void passwordTest_emptyString() {
        String result = PasswordStrengthEvaluator.evaluateStrength("");
        assertEquals("WEAK", result);
    }
    @Test
    public void passwordTest_null() {
        String result = PasswordStrengthEvaluator.evaluateStrength(null);
        assertEquals("WEAK", result);
    }
    @Test
    public void passwordTest_containsSpace() {
        String result = PasswordStrengthEvaluator.evaluateStrength("ab cd");
        assertEquals("WEAK", result);
    }
    @Test
    public void passwordTest_lessThan6Characters() {
        String result = PasswordStrengthEvaluator.evaluateStrength("abcde");
        assertEquals("WEAK", result);
    }
    //requirements for strength of password
    @Test
    public void passwordTest_atLeastOneLowercase() {
        String result = PasswordStrengthEvaluator.evaluateStrength("abcdef");
        assertEquals("WEAK", result);
    }
    @Test
    public void passwordTest_atLeastOneUppercase() {
        String result = PasswordStrengthEvaluator.evaluateStrength("ABCDEF");
        assertEquals("WEAK", result);
    }
    @Test
    public void passwordTest_atLeastOneNumber() {
        String result = PasswordStrengthEvaluator.evaluateStrength("123456");
        assertEquals("WEAK", result);
    }
    @Test
    public void passwordTest_atLeastOneSpecialCharacter() {
        String result = PasswordStrengthEvaluator.evaluateStrength("!!!!!!");
        assertEquals("WEAK", result);
    }
    @Test
    public void passwordTest_moreThanTenCharacters() {
        String result = PasswordStrengthEvaluator.evaluateStrength("abcdefghij");
        assertEquals("WEAK", result);
    }
    @Test
    public void passwordTest_weakPassword() {
        String result = PasswordStrengthEvaluator.evaluateStrength("ab1");
        assertEquals("WEAK", result);
    }
    @Test
    public void passwordTest_mediumPassword() {
        String result = PasswordStrengthEvaluator.evaluateStrength("Abc123");
        assertEquals("MEDIUM", result);
    }
    @Test
    public void passwordTest_strongPassword() {
        String result = PasswordStrengthEvaluator.evaluateStrength("aaaAAAbbb!223j");
        assertEquals("STRONG", result);
    }


    // TODO: weitere Tests ergänzen
}
