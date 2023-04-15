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
public class UppercaseToLowecrase {
    public static void main(String[] args) {
        char ch;
        Scanner obj=new Scanner(System.in);
        do
        {
        System.out.println("Enter an uppercase character:");
        ch=obj.next().charAt(0);
        int x=(int)ch;
        if((x>=65)&&(x<=90))
        {
            x=x+32;
            char ch2=(char)x;
            System.out.println("Lowercase conversion is:"+ch2);
        }
        else
        {
            System.out.println("Entered character is not in Uppercse!");
        }
        }
        while((((int)ch)<65)||(((int)ch)>90));
    }
    
}
