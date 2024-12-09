package bank;
import BankCheckFeatures.Funzione;
public class BankAccount extends Funzione {

    // Private: i dettagli sensibili sono accessibili solo all'interno di questa classe
    private String accountHolderName; 
    private double balance; 

    // Public: costruttore accessibile da altre classi
    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Public: permette di accedere al saldo tramite un metodo (non direttamente)
    public double getBalance() {
        return balance;
    }

    // Protected: consente di modificare il saldo solo alle sottoclassi o nello stesso pacchetto
    protected void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("hai Depositato: €" + amount);
            aggiornaCronologia(amount);
        } else {
            System.out.println("Importo non valido!");
        }
    }

    // Protected: consente di prelevare, con verifica dello stesso pacchetto o da sottoclassi
    protected void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Prelevato: €" + amount);
            aggiornaCronologia(-amount);
          
        } else {
            System.out.println("Saldo insufficiente o importo non valido!");
        }
        
    }
protected void stamp() {
	readCronologia();
}
    // Default: metodo interno per verificare l'identità (accessibile solo nello stesso pacchetto)
    boolean verifyIdentity(String name) {
        return this.accountHolderName.equals(name);
    }
}
//brench di Riccardo