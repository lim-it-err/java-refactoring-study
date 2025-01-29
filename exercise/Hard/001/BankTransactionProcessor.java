import java.util.*;

public class BankTransactionProcessor {
    private Map<String, Double> accounts;
    private List<String> transactionLog;

    public BankTransactionProcessor() {
        accounts = new HashMap(); // 1. Raw type usage
        transactionLog = new ArrayList(); // 2. Missing generics
    }

    public void deposit(String accountId, double amount) {
        if (amount < 0) {
            System.out.println("Invalid deposit amount"); // 3. Weak error handling
            return;
        }
        accounts.put(accountId, accounts.getOrDefault(accountId, 0.0) + amount);
    }

    public void withdraw(String accountId, double amount) {
        if (!accounts.containsKey(accountId) || accounts.get(accountId) < amount) {
            System.out.println("Insufficient funds"); // 4. No proper exception handling
            return;
        }
        accounts.put(accountId, accounts.get(accountId) - amount);
        transactionLog.add("Withdraw: " + accountId + " - " + amount);
    }

    public double checkBalance(String accountId) {
        return accounts.getOrDefault(accountId, 0.0);
    }

    public void processBatchTransactions(List<String> transactions) {
        for (String txn : transactions) {
            String[] parts = txn.split(",");
            if (parts.length != 3) {
                System.out.println("Invalid transaction format"); // 5. Poor input validation
                continue;
            }
            String type = parts[0];
            String accountId = parts[1];
            double amount = Double.parseDouble(parts[2]); // 6. Potential NumberFormatException

            if (type.equals("DEPOSIT")) {
                deposit(accountId, amount);
            } else if (type.equals("WITHDRAW")) {
                withdraw(accountId, amount);
            }
        }
    }
}