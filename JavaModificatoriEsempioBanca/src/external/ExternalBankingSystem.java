package external;

import bank.BankAccount;

public class ExternalBankingSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Mario Rossi", 500);

        // Accesso solo al metodo pubblico
        System.out.println("Saldo disponibile (accesso esterno): €" + account.getBalance());

        // account.deposit(200); // Errore: non accessibile perché protected
        // account.withdraw(100); // Errore: non accessibile perché protected
        // account.verifyIdentity("Mario Rossi"); // Errore: non accessibile perché default
    }
}
