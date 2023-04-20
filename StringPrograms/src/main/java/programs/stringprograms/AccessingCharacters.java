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
public class AccessingCharacters {
    public static void main(String[] args) {
        System.out.print("Enter a string:");
        Scanner obj=new Scanner(System.in);
        String str=obj.nextLine();
        for(int i=0;i<str.length();i++)
        {
           System.out.println("Character st index "+i+" is:"+str.charAt(i));
        }      
    }
    
}
