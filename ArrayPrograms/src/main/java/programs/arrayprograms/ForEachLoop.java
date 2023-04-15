package programs.arrayprograms;
import java.util.Scanner;
public class ForEachLoop {
    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter any 5 array elements:");
        for(int i=0;i<5;i++)
        {
            arr[i]=obj.nextInt();
        }
        System.out.println("Entered array elements are:");
        for(int b:arr) //for each loop
        {
            System.out.print(b+" ");
        }
    }    
}
