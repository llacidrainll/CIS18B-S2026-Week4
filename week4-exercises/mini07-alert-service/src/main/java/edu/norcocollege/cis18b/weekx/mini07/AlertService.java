package edu.norcocollege.cis18b.weekx.mini07;

public class AlertService {
    private final AlertRepository repository;
    private final AlertValidator validator;

    public AlertService(AlertRepository repository) {
        this.repository = repository;
        this.validator = new AlertValidator();
    }

    public void processAlert(Alert alert)
            throws InvalidAlertException, AlertStorageException, AlertProcessingException {
        try {
        // Validate the alert
        validator.validate(alert);

        // Save the alert
        repository.save(alert);

    } catch (InvalidAlertException | AlertStorageException ex) {
        // These are expected exceptions → just rethrow them
        throw ex;
    } catch (Exception ex) {
        // Unexpected errors → wrap in AlertProcessingException
        throw new AlertProcessingException("Unexpected error processing alert", ex);
    }
}
}