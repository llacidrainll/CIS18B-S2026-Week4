package edu.norcocollege.cis18b.weekx.mini09;

public class DecoratorApp {
    public static void main(String[] args) {
        Alert alert = new Alert(1, "CPU usage exceeded threshold", AlertLevel.CRITICAL);

        AlertHandler basicHandler = new BasicAlertHandler();

        AlertHandler loggingHandler = new LoggingAlertHandlerDecorator(basicHandler);

        loggingHandler.handle(alert);
    }
}