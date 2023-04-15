package programs.previousyearquestionstmv;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        int x,sum=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=obj.nextInt();
        int num2=num;
        while(num>0)
        {
            x=num%10;
            sum=sum+x;
            num=num/10;
        }
        System.out.println("Sum of digits in "+num2+" is:"+sum);
    }
    
}
