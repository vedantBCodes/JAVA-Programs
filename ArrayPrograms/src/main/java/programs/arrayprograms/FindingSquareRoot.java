/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programs.arrayprograms;

import static java.lang.Math.sqrt;
import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class FindingSquareRoot {
    public static void main(String[] args) {
        System.out.println("Enter  a number:");
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int x=(int) sqrt(num);
        System.out.println("Square root of "+num+" is:"+x);
        System.out.println("Enter  another number:");
        int num2=obj.nextInt();
        for(int i=1;i<=num2;i++)
        {
            if((i*i)==num2)
            {
                System.out.println("Square root of "+num2+" is:"+i);
                exit(0);
            }
        }        
        System.out.println(num2+" is not a square of any whole number");
    }    
}
