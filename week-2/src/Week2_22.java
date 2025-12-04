//Create a class with private members and access them via public getter and setter methods.
class BankAccount {

    private Double balance;
    private String loanAccountNumber;


    public BankAccount(String loanAccountNumber, double initialBalance) {
        setLoanAccountNumber(loanAccountNumber);
        setBalance(initialBalance);
    }


    public Double getBalance() {
        return balance;
    }

    public String getLoanAccountNumber() {
        return loanAccountNumber;
    }


    public void setBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative!");
        }
        this.balance = balance;
    }

    public void setLoanAccountNumber(String loanAccountNumber) {
        if (loanAccountNumber == null || !loanAccountNumber.matches("\\d{10,15}")) {
            throw new IllegalArgumentException("Invalid account number! Should be 10–15 digits.");
        }
        this.loanAccountNumber = loanAccountNumber;
    }


    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than zero.");
            return;
        }
        balance += amount;
        System.out.println(amount + " credited. New balance: " + balance);
    }


    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance!");
            return;
        }

        balance -= amount;
        System.out.println(amount + " debited. Remaining balance: " + balance);
    }
}
