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
public class ExtractingSubstring {
    public static void main(String[] args) {
        System.out.print("Enter a string:");
        Scanner obj=new Scanner(System.in);
        String str=obj.nextLine();
        int start=2;
        int end=5;
        char substring[ ]=new char[end-start];
        str.getChars(start, end, substring, 0);
        System.out.print(substring);
    }
    
}
