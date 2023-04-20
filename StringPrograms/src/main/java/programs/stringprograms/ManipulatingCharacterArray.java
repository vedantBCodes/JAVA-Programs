/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programs.stringprograms;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ManipulatingCharacterArray {
    public static void main(String[] args) {
        System.out.println("Enter another string:");
        char str[]={'v','e','d','a','n','t'}; //static memory allocation
         for(int i=0;i<str.length;i++)
       {
            System.out.println("Character st index "+i+" is:"+str[i]);           
       }
       System.out.print("Enter a string:");
       Scanner obj=new Scanner(System.in);
       char[] str2 = obj.next().toCharArray();
       for(int i=0;i<str.length;i++)
       {
            System.out.println("Character st index "+i+" is:"+str2[i]);           
       }
    }
}
