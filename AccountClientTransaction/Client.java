package AccountClientTransaction;

public class Client {
    public String name;
    public String address;
    public Account account;

    public Client() {
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }
}
