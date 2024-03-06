package labtask;

/*Write a Java program to create a base class BankAccount with methods deposit() and withdraw(). Create two subclasses SaveAcc
and CheckAcc. Override the withdraw() method in each subclass to impose different withdrawal limits and fees.*/


import java.util.*;

class B_Acc
{
    protected double balance;

    public B_Acc(double initialBalance)
    {
        this.balance = initialBalance;
    }

    public void deposit(double amount)
    {
        balance += amount;
        System.out.println("Deposited: $" + amount);
        System.out.println("Current Balance: $" + balance);
    }

    public void withdraw(double amount) 
    {
        if (amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("Current Balance: $" + balance);
        } 
        else
        {
            System.out.println("Insufficient funds!");
        }
    }
}

class SaveAcc extends BankAccount 
{
    private double withdrawalLimit;
    public SaveAcc(double initialBalance, double withdrawalLimit) 
    {
        super();
        this.withdrawalLimit = withdrawalLimit;
    }

    public void withdraw(double amount)
    {
        if (amount <= withdrawalLimit && amount <= withdrawalLimit)
        {
            withdrawalLimit -= amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("Current Balance: $" + withdrawalLimit);
        } 
        else 
        {
            System.out.println("Withdrawal limit exceeded or insufficient funds!");
        }
    }

	public void deposit(double depositAmountSavings) {
		// TODO Auto-generated method stub
		
	}
}

class CheckAcc extends BankAccount 
{
    private double overdraftFee;

    public CheckAcc(double initialBalance, double overdraftFee) 
    {
        super();
        this.overdraftFee = overdraftFee;
    }

    public void withdraw(double amount) 
    {
        if (amount <= amount) 
        {
            amount -= amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("Current Balance: $" + amount);
        } 
        else 
        {
            amount -= overdraftFee;
            System.out.println("Withdrawn with overdraft fee: $" + (amount + overdraftFee));
            System.out.println("Current Balance: $" + amount);
        }
    }

	public void deposit(double depositAmountChecking) {
		// TODO Auto-generated method stub
		
	}
}

public class BankAccountApp 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

        System.out.println("Creating Savings Account...");
        System.out.println("Enter initial balance:");
        double savingsInitialBalance = scanner.nextDouble();
        System.out.println("Enter withdrawal limit:");
        double savingsWithdrawalLimit = scanner.nextDouble();
        SaveAcc SaveAcc = new SaveAcc(savingsInitialBalance, savingsWithdrawalLimit);

        System.out.println("Creating Checking Account...");
        System.out.println("Enter initial balance:");
        double checkingInitialBalance = scanner.nextDouble();
        System.out.println("Enter overdraft fee:");
        double checkingOverdraftFee = scanner.nextDouble();
        CheckAcc CheckAcc = new CheckAcc(checkingInitialBalance, checkingOverdraftFee);

        System.out.println("Enter deposit amount for Savings Account:");
        double depositAmountSavings = scanner.nextDouble();
        SaveAcc.deposit(depositAmountSavings);

        System.out.println("Enter withdrawal amount for Savings Account:");
        double withdrawAmountSavings = scanner.nextDouble();
        SaveAcc.withdraw(withdrawAmountSavings);

        System.out.println("Enter deposit amount for Checking Account:");
        double depositAmountChecking = scanner.nextDouble();
        CheckAcc.deposit(depositAmountChecking);

        System.out.println("Enter withdrawal amount for Checking Account:");
        double withdrawAmountChecking = scanner.nextDouble();
        CheckAcc.withdraw(withdrawAmountChecking);

	}
}


