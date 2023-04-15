/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programs.previousyearquestionstmv;

/**
 *
 * @author Lenovo
 */
public class EvenAndOdd {
    public static void main(String[] args) {
        int i;
        System.out.print("Even numbers between 50 and 100 are:");
        for(i=50;i<=100;i++)
        {
            if(i%2==0)
            {
                System.out.print(i+" ");
            }            
         }
        System.out.print("\nOdd numbers between 50 and 100 are:");
        for(i=50;i<=100;i++)
        {
            if(i%2!=0)
            {
                System.out.print(i+" ");
            }            
         }
    }
    
}
