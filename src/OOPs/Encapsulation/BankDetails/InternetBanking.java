package OOPs.Encapsulation.BankDetails;

public class InternetBanking {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Shivam singh",
                100, 123456789 );
        System.out.println(acc.CurrentBalance);
        acc.Deposit(100);
        acc.withdraw(50);
    }
}
