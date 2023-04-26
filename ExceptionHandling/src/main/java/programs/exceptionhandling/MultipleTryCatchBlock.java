/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programs.exceptionhandling;

/**
 *
 * @author Lenovo
 */
public class MultipleTryCatchBlock {
    public static void main(String[] args) {
        int a=10,b=0,c;
        int arr[]={1,2,3,4,5};
        try{
            c=a/b;
            System.out.println("c:"+c);
        }
        catch(ArithmeticException x)
        {
            System.out.println("Number can't be devided by zero");
        }
        try{
            System.out.println(arr[5]);//There is no array element at index 5            
        }        
        catch(ArrayIndexOutOfBoundsException x)
        {
            System.out.println("You can't access beyond the array limit");
        }
    }
    
}
