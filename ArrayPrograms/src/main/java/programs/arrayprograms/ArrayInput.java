package programs.arrayprograms;
import java.util.Scanner;
public class ArrayInput {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int arr1[]={10,20,30,40,50};//Compile time initialization
        System.out.println("Enter the size of array:");
        int size=obj.nextInt();
        int arr2[]=new int[10]; //Array declaration
        System.out.println("Enter any "+size+" array elements:");
        for(int i=0;i<size;i++)
        {
            arr2[i]=obj.nextInt(); //Run time initialization
        }
        System.out.println("Array elements in arr1 are:");
        for(int i=0;i<5;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println("\nEntered array elements in arr2 are:");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr2[i]+" ");
        }        
    }
    
}
