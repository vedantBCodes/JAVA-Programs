/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programs.exceptionhandling;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ThrowKeyword {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter any two numbers:");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();    
        c=a/b;
        if(b!=0)
        {
            System.out.println("c:"+c);
        }
        else
        {
            throw new ArithmeticException ("Number can't devide by zero");
            
        }
    }    
}
