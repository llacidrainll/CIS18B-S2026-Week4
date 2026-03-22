package edu.norcocollege.cis18b.weekx.mini04;

public class AlertValidationApp {
    public static void main(String[] args) {
        AlertValidator validator = new AlertValidator();

        Alert validAlert = new Alert(1, "CPU usage high", AlertLevel.WARNING);
        Alert invalidAlert = new Alert(2, "   ", null);
        try {
            validator.validate(validAlert);
            System.out.println("Valid alert processed successfully.");
        } catch (InvalidAlertException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        // Validate invalid alert
        try {
            validator.validate(invalidAlert);
            System.out.println("Valid alert processed successfully.");
        } catch (InvalidAlertException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
