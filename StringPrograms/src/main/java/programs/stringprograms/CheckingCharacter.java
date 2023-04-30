/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programs.stringprograms;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class CheckingCharacter {
    void CharacterCheck(String str,char ch)
    {
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch)
            {
                System.out.println(ch+" character is present in "+str);
                exit(0);
            }
        }
        System.out.println(ch+" character is not present in "+str);
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=obj.nextLine();
        System.out.println("Enter a charcter to check whether it is present in a given array or not:");
        char ch=obj.next().charAt(0);
        CheckingCharacter obj2=new CheckingCharacter();
        obj2.CharacterCheck(str,ch);
    }
    
}
