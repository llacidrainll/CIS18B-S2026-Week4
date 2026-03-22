package edu.norcocollege.cis18b.weekx.mini04;

public class AlertValidator {
    public void validate(Alert alert) throws InvalidAlertException {
         if (alert == null) {
            throw new InvalidAlertException("Alert cannot be null.");
        }

        // Throw if alert message is null or blank
        if (alert.getMessage() == null || alert.getMessage().isBlank()) {
            throw new InvalidAlertException("Message cannot be empty.");
        }

        // Throw if alert level is null
        if (alert.getLevel() == null) {
            throw new InvalidAlertException("Level cannot be null.");
    }
    }
}
