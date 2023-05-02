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
public class MethodOverlaoding {
    void sum()
    {
        int a,b;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter any two numbers:");
         a=obj.nextInt();
         b=obj.nextInt();
        System.out.println("Sum of "+a+" and "+b+" is:"+(a+b));
    }
    void sum(int a,int b)
    {
        System.out.println("Sum of "+a+" and "+b+" is:"+(a+b));
    }
    void sum(double a,double b)
    {
        System.out.println("Sum of "+a+" and "+b+" is:"+(a+b));
    }
    public static void main(String[] args) {
       MethodOverlaoding obj2=new MethodOverlaoding();
       obj2.sum();
       obj2.sum(2,4);
       obj2.sum(2.5,3.5);
    }    
}
