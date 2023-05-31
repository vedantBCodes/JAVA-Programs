package programs.stringprograms;

import static java.lang.System.exit;
import java.util.Scanner;

public class StringCompair {
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner obj=new Scanner(System.in);
        String str1=obj.nextLine();
        System.out.println("Enter another string:");
        String str2=obj.nextLine();
        if(str1.length()==str2.length())
        {
        for(int i=0;i<str2.length();i++)
        {
            if(str1.charAt(i)!=str2.charAt(i))
            {
                System.out.println("Both entered strings are not same");
                exit(0);
            }
        }
        System.out.println("Both entered strings are same");
        }
        else
        {
            System.out.println("Strings are different");
        }
    }
    
}
