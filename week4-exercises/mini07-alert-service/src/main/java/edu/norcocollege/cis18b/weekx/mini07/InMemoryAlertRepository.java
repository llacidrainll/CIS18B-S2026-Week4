package edu.norcocollege.cis18b.weekx.mini07;

import java.util.ArrayList;
import java.util.List;

public class InMemoryAlertRepository implements AlertRepository {
    private final List<Alert> alerts = new ArrayList<>();

    @Override
    public void save(Alert alert) throws AlertStorageException {
        // TODO: Save the alert or simulate a failure.
     try {
            // Optional: simulate a low-level failure
            // Uncomment the next line to test exception handling
            // throw new RuntimeException("Simulated storage failure");

            // Save the alert
            alerts.add(alert);

        } catch (RuntimeException ex) {
            // Translate low-level exception into AlertStorageException
            throw new AlertStorageException("Failed to save alert.", ex);
        }
    }

    public List<Alert> findAll() {
        return new ArrayList<>(alerts);
    }
}
