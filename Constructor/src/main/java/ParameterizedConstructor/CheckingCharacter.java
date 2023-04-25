package ParameterizedConstructor;
import java.util.Scanner;
public class CheckingCharacter { //NOTE-CHARACTERS INCLUDES ALPHABET,NUMBERS AND SPECIAL CHARACTERS
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a character:");
        char ch=obj.next().charAt(0);
        if((ch>='A')&&(ch<='Z')||(ch>='a')&&(ch<='z'))
        {
            System.out.println(ch+" is an alphabet");
        }
        else
        if((ch>='0')&&(ch<='9'))
        {
            System.out.println(ch+" is a number");
        }
        else
        {
            System.out.println(ch+" is a special character");
        }
    }  
 }
