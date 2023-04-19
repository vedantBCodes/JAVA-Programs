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
public class StringConcatenation {
    public static void main(String[] args) {
        System.out.print("Enter a string:");
        Scanner obj=new Scanner(System.in);
        String str1=obj.nextLine();
        System.out.print("Enter another string:");
        String str2=obj.nextLine();
        String str3=str1+" "+str2;
        System.out.print("Concatenated String:"+str3);        
    }    
}
