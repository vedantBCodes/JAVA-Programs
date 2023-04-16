package programs.stringprograms;

import java.util.Scanner;

public class StringReverse {
    static void SReverse(String str)
    {
        String str2="";  //Empty string
        int length=str.length();
        for(int i=(length-1);i>=0;i--)
        {
           str2=str2+str.charAt(i);
        }
        System.out.println("Reversed String is:"+str2);
    }
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner obj=new Scanner(System.in);
        String str=obj.nextLine();       
        SReverse(str);
    }
    
    
}
