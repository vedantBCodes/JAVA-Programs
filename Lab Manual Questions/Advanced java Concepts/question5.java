/*
Create a custom exception InsufficientBalanceException.
• Write a program where users can deposit and withdraw money from a bank account.
• Throw the exception if the withdrawal amount exceeds the account balance.
 */

import java.util.Scanner;

class InsufficientBalanceException extends Exception
{
    public InsufficientBalanceException(String message)
    {
       super(message);
    }
}
public class question5 
{
    public static void checkBalance(int deposit , int withdraw) throws InsufficientBalanceException
    {
        try
        {
            if(withdraw>deposit)
            {
                throw new InsufficientBalanceException("ERROR : Withdrawal amount excceds");
            }
            else
            {
                System.out.println("You can withdraw");
            }
        }
        finally
        {

        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter deposit : ");
        int deposit = scanner.nextInt();

        System.out.println("Enter withdrawal amount :");
        int withdraw = scanner.nextInt();

        try
        {
            checkBalance(deposit , withdraw);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
    
}
