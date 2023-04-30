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
public class CalculatingOccuranceOfCharacter {
    void CheckOccurancea(String str,char ch)
    {
        int cnt=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch)
            {
               cnt++;
            }
        }
        if(cnt!=0)
        {
        System.out.println(ch+" occurs "+cnt+" times");
        }
        else
        {
        System.out.println(ch+" is not there in "+str);
        }
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=obj.nextLine();
        System.out.println("Enter a charcter to check:");
        char ch=obj.next().charAt(0);
        CalculatingOccuranceOfCharacter obj2=new CalculatingOccuranceOfCharacter();
        obj2.CheckOccurancea(str,ch);
    }
    
    
}
