public class Bank {
    private double amount;

    public Bank(double amount) {
        this.amount = amount;
    }

    public void withdraw(double withdrawalAmount) {
        String message = (withdrawalAmount <= amount) ? "Withdrawal successful" : "Insufficient balance";
        System.out.println(message);
        if (withdrawalAmount <= amount) {
            amount -= withdrawalAmount;
        }
    }

    public void deposit(double depositAmount) {
        amount += depositAmount;
    }

    public void displayBalance() {
        System.out.println("Total balance: " + amount);
    }

    public static void main(String[] args) {
        Bank bank = new Bank(10000);
        bank.withdraw(3000);
        bank.deposit(5000);
        bank.displayBalance();
    }
}

/*
Sample Output:
Withdrawal successful
Total balance: 12000.0
*/
