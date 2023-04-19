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
public class StringConcatenation2 {
    public static void main(String[] args) {
        System.out.print("Enter a string:");
        Scanner obj=new Scanner(System.in);
        String str1=obj.nextLine();
        System.out.print("Enter another string:");
        String str2=obj.nextLine();
        String str3=str1.concat(str2);
        System.out.println("Concatenated String:"+str3);
        String str4="hello ".concat(str1);
        System.out.println("Concatenated String:"+str4);
        String str5=str1.concat(" How are you!");
        System.out.println("Concatenated String:"+str5);
    }    
}
