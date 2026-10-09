import java.util.Scanner;

class BankAccountPractice
{
    private String AccountHolder;
    private double Balance;
    private double amount;

    BankAccountPractice(String AccountHolder, double Balance)
    {
        this.AccountHolder = AccountHolder;
        this.Balance = Balance;
    }

    public void setAccountHolder(String AccountHolder)
    {
        this.AccountHolder = AccountHolder;
    }
    public String getAccountHolder()
    {
        return AccountHolder;
    }

    public void setBalance(double Balance)
    {
        this.Balance = Balance;
    }

    public double getBalance()
    {
        return Balance;
    }

    public void deposit(double amount)
    {
        if(amount>0)
        {
            Balance = Balance + amount;
        }
        else{
            System.out.println("Invalid Desposit");
        }
    }

    public void withdraw(double amount)
    {
        if(amount>0 && amount<=Balance)
        {
            Balance = Balance-amount;
        }
        else{
            System.out.println("Invalid Withdraw");
        }
    }

}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        BankAccountPractice bap = new BankAccountPractice("Raga", 1000);
        System.out.println("Account Holder: " + bap.getAccountHolder());
        System.out.println(bap.getAccountHolder() + " " + "current balance: " + bap.getBalance());
        System.out.println("What do you Wanna Do- Deposit OR Withdraw ");
        String userinput = sc.next();
        if(userinput.equals("deposit"))
        {
            System.out.println("Enter your money to be deposited: ");
            double amount = sc.nextDouble();
            System.out.println("You deposited" + " " + amount +  " "+ "this amount");
            bap.deposit(amount);
            System.out.println("Your Current Balance: " + bap.getBalance());



        } else if (userinput.equals("withdraw"))
        {
            System.out.println("Enter your money to be withdrawed: ");
            double amount = sc.nextDouble();
            System.out.println("You Withdrawed"+ " " + amount+ " "+ "this amount");
            bap.withdraw(amount);
            System.out.println("Your Current Balance: "+ bap.getBalance());


        }
        else
        {
            System.out.println("Invalid");
        }


        /*bap.deposit(2000);
        System.out.println("Account Holder Deposited Some Amount");
        System.out.println("Current Balance: "+ bap.getBalance());
        bap.withdraw(150);
        System.out.println("Acount Holder WithDrawed Some Amount");
        System.out.println("Current Balance: "+ bap.getBalance());*/


    }
}