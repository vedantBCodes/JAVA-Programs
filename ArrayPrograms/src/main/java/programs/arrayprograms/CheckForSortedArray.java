package programs.arrayprograms;

import static java.lang.System.exit;
import java.util.Scanner;

public class CheckForSortedArray {
    public static void main(String[] args) {
        System.out.println("Enter the size of array:");
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt();
        int arr[]=new int[size];
        int arr2[]=new int[size];
        System.out.println("Enter any "+size+" array elements:");
        for(int i=0;i<size;i++)
        {
            arr[i]=obj.nextInt();
        }
       int cnt=0;
        for(int i=0;i<size;i++)
        {
            for(int j=(i+1);j<size;j++)
            {
                if(arr[i]>arr[j])
                {
                    System.out.println("Entered array is not sorted");
                    exit(0);
                }
            }
        }       
            System.out.println("Entered array is sorted");        
    }    
}
