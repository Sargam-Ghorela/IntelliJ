package Oct1;

public class Bank {
    String banName;
    int  accountNumber;
    String customerName;
    int balance;
    String transactionType;

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
    public String getTransactionType() {
        return transactionType;
    }
    public int getBalance() {
        return balance;
    }

}
