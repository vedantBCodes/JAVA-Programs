package ParameterizedConstructor;
import java.util.Scanner;
public class CheckingCharacter { //NOTE-CHARACTERS INCLUDES ALPHABET,NUMBERS AND SPECIAL CHARACTERS
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a character:");
        char ch=obj.next().charAt(0);
        System.out.println((int)ch);
        int num=(int)ch;
       if((num>=65 && num<=90) || (num>=97 && num=<120))
        {
            System.out.println(ch+" is an alphabet");
        }
    }
    
    
}
