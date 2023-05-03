/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programs.internalexampracticeprogramstmv;

/**
 *
 * @author Lenovo
 */
public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int sum=0;
        int i;
        for(i=1;i<=50;i++)
        {
            if(i%2==0)
            {
                sum=sum+i;
            }
        }
        System.out.println("Sum of even numbers from 1 to 50 are:"+sum);
    }
    
}
