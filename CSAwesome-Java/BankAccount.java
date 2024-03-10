/**Create a class called BankAccount below that keeps track of the account holder’s name, the account number, and the balance in the account. Make sure you use the appropriate data types for these.
 Write 2 constructors for the class: one that initializes all the instance variables and one that only has 2 parameters for the name and account number and initializes the balance to 0. For the parameters, use the same variable names as your instance variables. Use the this keyword to distinguish between the instance variables and the parameter variables.
 Write a toString method for the class. Use the this keyword to return the instance variables.
 Write withdraw(amount) and deposit(amount) methods for the class. The withdraw method should subtract the amount from the balance as long as there is enough money in the account (the balance is larger than the amount). And deposit should add the amount to the balance. Use the this keyword to refer to the balance.
 Test your class below with a main method that creates a BankAccount object and calls its deposit and withdraw methods and prints out the object to test its toString method.
*/



public class BankAccount
{
    private String name;
    private int account_number;
    private int balance;

    public BankAccount(String name,int account_number,int balance)
    {
        this.name=name;
        this.account_number=account_number;
        this.balance=balance;
    }

    public BankAccount(String name,int account_number)
    {
        this.name=name;
        this.account_number=account_number;
        balance=0;
    }

    public String toString()
    {
        return name+account_number+balance;
    }

    public void withdraw(int amount)
    {
        while(amount>0)
        {
            amount=amount-this.balance;
        }

    }


    public void deposit(int amount)
    {
        amount=amount+this.balance;
    }

    public static void main(String[] args)
    {
        BankAccount bank = new BankAccount("omer",888,99999);
        bank.deposit(50);
        bank.withdraw(90);
        bank.toString();
    }
}
