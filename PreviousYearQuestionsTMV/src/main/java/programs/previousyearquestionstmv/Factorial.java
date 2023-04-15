package basicprograms;

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int fact=1;
        System.out.print("Enter a number:");
        int num=obj.nextInt();
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of "+num+" is:"+fact);
    }
    
}
