package edu.norcocollege.cis18b.weekx.mini08;

public class ObserverApp {
    public static void main(String[] args) {
        AlertService service = new AlertService();

        service.addObserver(new EmailAlertObserver());
        service.addObserver(new LogAlertObserver());

        // Create an alert
        Alert alert = new Alert(1, "CPU usage high", AlertLevel.CRITICAL);

        service.processAlert(alert);
    }
}
