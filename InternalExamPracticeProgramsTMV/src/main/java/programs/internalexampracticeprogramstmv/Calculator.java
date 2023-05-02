/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programs.internalexampracticeprogramstmv;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter any two numbers:");
        int a=obj.nextInt();
        int b=obj.nextInt();
        System.out.println("Which operation you want to perform:");
        System.out.println("press '+' for addition");
        System.out.println("press '-' for substraction");
        System.out.println("press '*' for multiplication");
        System.out.println("press '/' for division");
        System.out.println("press '%' for calculating modulus");
        char ch=obj.next().charAt(0);
        switch(ch)
        {
            case'+':
                System.out.println("Addition of "+a+" and "+b+" is:"+(a+b));
                break;
            case'-':
                System.out.println("Substaction of "+a+" and "+b+" is:"+(a-b));
                break;
            case'*':
                System.out.println("Multiplication of "+a+" and "+b+" is:"+(a*b));
                break;
            case'/':
                System.out.println("Division of "+a+" and "+b+" is:"+(a/b));
                break;
            case'%':
                System.out.println("Modulus of "+a+" and "+b+" is:"+(a%b));
                break;
            default:
                System.out.println("Please enter a valid operator:");                
        }
        
    }
    
}
