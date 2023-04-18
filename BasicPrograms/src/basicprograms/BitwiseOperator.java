/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicprograms;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class BitwiseOperator {
    public static void main(String[] args) {
        System.out.println("Enter any two numbers:");
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        System.out.println(a+"&"+b+":"+(a&b));
        System.out.println(a+"|"+b+":"+(a|b));
        System.out.println("~"+a+":"+~a);
        System.out.println("~"+b+":"+~b);
    }
    
}
