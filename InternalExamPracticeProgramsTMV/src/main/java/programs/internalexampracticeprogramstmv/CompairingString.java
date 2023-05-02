/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programs.internalexampracticeprogramstmv;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class CompairingString {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int i;
        System.out.println("Enter a string:");
        String str1=obj.nextLine();
        System.out.println("Enter another string:");
        String str2=obj.nextLine();
        if(str1.length()==str2.length())
        {
            for(i=0;i<str1.length();i++)
            {
                if(str1.charAt(i)!=str2.charAt(i))
                {
                    System.out.println("Both strings are different");
                    exit(0);
                }
            }
            System.out.println("Both strings are same");
        }
        else
        {
            System.out.println("Both strings are different");
        }
    }
    
}
