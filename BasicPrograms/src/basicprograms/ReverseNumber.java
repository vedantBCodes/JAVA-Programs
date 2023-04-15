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
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int num,rev=0;
        System.out.print("Enter a number:");
        num=obj.nextInt();
        while(num>0)
        {
            int x=num%10;
            rev=x+rev*10;
            num=num/10;
        }
        System.out.println("Reversed number is:"+rev);
        
    }
    
}
