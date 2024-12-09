package bank;

public class BankOperations {
 public static void main(String[] args) {
     BankAccount account = new BankAccount("Mario Rossi", 500);

     System.out.println("Saldo iniziale: €" + account.getBalance());
     
     account.deposit(200); // Accessibile perché è protected e siamo nello stesso pacchetto
     System.out.println("Saldo dopo deposito: €" + account.getBalance());

     account.withdraw(100); // Accessibile perché è protected e siamo nello stesso pacchetto
     System.out.println("Saldo dopo prelievo: €" + account.getBalance());
     
     account.stamp();
     // account.verifyIdentity("Mario Rossi"); // Non visibile perché è default e non è chiamato dalla stessa classe
 }
}