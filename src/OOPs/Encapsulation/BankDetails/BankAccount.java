package OOPs.Encapsulation.BankDetails;

public class BankAccount {
    private long accountNumber;
    private final String accountHolderName;
    public long CurrentBalance;

    public BankAccount(String accountHolderName, long CurrentBalance, long accountNumber) {
        this.accountHolderName = accountHolderName;
        this.CurrentBalance = CurrentBalance;
        this.accountNumber = accountNumber;
    }

    public void Deposit(long DepositedBalance){
this.CurrentBalance=CurrentBalance+DepositedBalance;
        System.out.println("balance deposited your current balance is: "+CurrentBalance);
    }

    public void withdraw(long withdrawBalance){
        if (withdrawBalance>this.CurrentBalance){
            System.out.println("you have not that much balance in your account");
        }else{
            this.CurrentBalance= this.CurrentBalance-withdrawBalance;
            System.out.println(withdrawBalance+"Debited from your account and your current balance is "+this.CurrentBalance);
        }
    }
}
