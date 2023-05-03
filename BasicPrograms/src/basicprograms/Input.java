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
public class Input {
     public static void main(String[] args) {
        
        System.out.println("Enter an integer value:");
        Scanner obj =new Scanner(System.in);
        int num=obj.nextInt();
        System.out.println("Entered integer value is:"+num);
        System.out.println("Enter a string:");
        String str;
         str=obj.next();//This will take input of first word from the entered string
        System.out.println("Entered string is:"+str);
        System.out.println("Enter a character:");
        char ch=obj.next().charAt(0);
        System.out.println("Entered character is:"+ch);        
    }
    
}
