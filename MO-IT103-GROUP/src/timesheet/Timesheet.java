package timesheet;

import java.util.Date;

public class Timesheet {
    private double timeIn;
    private double timeOut;
    private Date date;

    // Constructor
    public Timesheet(double timeIn, double timeOut, Date date) {
        this.timeIn = timeIn;
        this.timeOut = timeOut;
        this.date = date;
    }

    // Getters and setters
    public double getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(double timeIn) {
        this.timeIn = timeIn;
    }

    public double getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(double timeOut) {
        this.timeOut = timeOut;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
