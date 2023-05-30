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
public class SeperatingSubstrings {
    public static String str;
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int cnt=1;
        while(cnt!=2)
        {
          cnt=0;
        System.out.println("Please enter a valid full name");
        String str2=obj.nextLine();
        str=str2.trim();
        for(int z=0;z<str.length();z++)
        {
            if((str.charAt(z)==' ')&&(str.charAt(z+1)!=' '))
            {
                cnt++;
            }
            
        }
        }        
        int i=0;
        while(str.charAt(i)!=' ')
        {
            i++;
        }
        String str2=str.substring(0,i);
        System.out.println("FirstName:"+str2);
        while(str.charAt(i)==' ')
        {
            i++;
        }
        int j=i;
        while(str.charAt(j)!=' ')
        {
            j++;
        }
        String str3=str.substring(i,j);

         System.out.println("MiddleName:"+str3);
        while(str.charAt(j)==' ')
        {
            j++;
        }
          int k=j;
          System.out.print("LastName:");
        for(int x=k;x<str.length();x++)
        {
            System.out.print(str.charAt(x));
        }
    }    
}
