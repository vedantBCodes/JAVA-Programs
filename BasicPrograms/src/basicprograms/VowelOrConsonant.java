
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter an alphabet:");
        char ch=obj.next().charAt(0);
        switch(ch)
        {
            case 'A':case 'E':case 'I':case 'O':case 'U':
            case 'a':case 'e':case 'i':case 'o':case 'u':
                System.out.println(ch+" is a vovel");
            break;
            default:
                System.out.println(ch+" is a consonant");
        }      
    }
    
}
