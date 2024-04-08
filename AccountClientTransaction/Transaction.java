package AccountClientTransaction;

import java.util.Date;

public class Transaction {
    private double value;
    private Date date;
    private String type;
    public Account account;

    public Transaction() {
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void addAccount(Account account) {
        this.account = account;
    }
}
