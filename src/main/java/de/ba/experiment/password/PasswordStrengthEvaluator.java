package de.ba.experiment.password;

public class PasswordStrengthEvaluator {

    /**
     * Bewertet die Stärke eines Passworts.
     *
     * (Siehe ausführliche Beschreibung in README.md)
     *
     * @param password das zu prüfende Passwort
     * @return "WEAK", "MEDIUM" oder "STRONG" nach Definition
     */

    public static String evaluateStrength(String password) {
        if (password == null || password.isEmpty()) {
            return "WEAK";
        }

        boolean hasLowercase = false;
        boolean hasUppercase = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                hasLowercase = true;
            } else if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else {
                hasSpecial = true;
            }
        }

        int points = 0;

        if (hasLowercase) points++;
        if (hasUppercase) points++;
        if (hasDigit) points++;
        if (hasSpecial) points++;
        if (password.length() >= 10) points++;

        if (points <= 2) {
            return "WEAK";
        } else if (points == 3) {
            return "MEDIUM";
        } else {
            return "STRONG";
        }
    }
}
