package edu.norcocollege.cis18b.weekx.mini03;

public class Alert {
    /** TODO: Add id, message, and level to the Alert class */
    private int id;
    private String message;
    private AlertLevel level;
    
    public Alert(int id, String message, AlertLevel level) {
        this.id = id;
        this.message = message;
        this.level = level;
    }

    /* TODO: Create getters and setters for this as well */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public AlertLevel getLevel() {
        return level;
    }

    public void setLevel(AlertLevel level) {
        this.level = level;
    }
}

