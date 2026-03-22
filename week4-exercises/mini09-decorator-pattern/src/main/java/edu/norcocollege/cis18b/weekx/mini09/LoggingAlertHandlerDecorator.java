package edu.norcocollege.cis18b.weekx.mini09;

public class LoggingAlertHandlerDecorator implements AlertHandler {
    private final AlertHandler wrapped;

    public LoggingAlertHandlerDecorator(AlertHandler wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void handle(Alert alert) {
        System.out.println("LOG: Received alert: " + alert.getMessage());

        wrapped.handle(alert);

        System.out.println("LOG: Finished processing alert");
    }
}
