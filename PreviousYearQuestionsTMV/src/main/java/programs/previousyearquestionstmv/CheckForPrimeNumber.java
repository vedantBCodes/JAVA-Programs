package programs.previousyearquestionstmv;

import java.util.Scanner;
public class CheckForPrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner obj=new Scanner(System.in);
        int cnt=0;
        int num=obj.nextInt();
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                cnt++;
            }
        }
        if(cnt==0)
        {
            System.out.println(num+" is a prime number");
        }
        else
        {
            System.out.println(num+" is not a prime number");
        }
    }
    
}
