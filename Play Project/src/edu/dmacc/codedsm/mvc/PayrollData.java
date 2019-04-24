package edu.dmacc.codedsm.mvc;

public class PayrollData{

    private String payeeName;

    public String getPayeeName() {
        return payeeName;
    }

    public void setPayeeName( String payeeName ) {
        this.payeeName = payeeName;
    }

    public Integer getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked( Integer hoursWorked ) {
        this.hoursWorked = hoursWorked;
    }

    private Integer hoursWorked;

    @Override
    public String toString() {
        return "PayrollData{" +
                "payeeName='" + payeeName + '\'' +
                ", hoursWorked=" + hoursWorked +
                '}';
    }
}
