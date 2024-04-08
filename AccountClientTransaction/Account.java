package AccountClientTransaction;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private int id_account;
    public List<Transaction> transactions;
    public Client client;

    public Account() {
        transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getId_account() {
        return id_account;
    }
    
}
