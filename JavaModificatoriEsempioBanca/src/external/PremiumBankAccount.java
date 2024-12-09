package external;

import bank.BankAccount;

public class PremiumBankAccount extends BankAccount {

    public PremiumBankAccount(String accountHolderName, double initialBalance) {
        super(accountHolderName, initialBalance);
    }

    public void premiumDeposit(double amount) {
    	amount = amount + 100;
        deposit(amount); // Accessibile perché è protected e siamo in una sottoclasse
    }

    public void premiumWithdraw(double amount) {
    	System.out.println("Siccome sei un utente premium, ti salutiamo con affetto");
        withdraw(amount); // Accessibile perché è protected e siamo in una sottoclasse
    }

    public static void main(String[] args) {
        PremiumBankAccount premiumAccount = new PremiumBankAccount("Luigi Bianchi", 1000);

        System.out.println("Saldo iniziale: €" + premiumAccount.getBalance());
        premiumAccount.premiumDeposit(500);
        System.out.println("Saldo dopo deposito premium: €" + premiumAccount.getBalance());
        premiumAccount.premiumWithdraw(300);
        System.out.println("Saldo dopo prelievo premium: €" + premiumAccount.getBalance());
    }
}
