/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programs.arrayprograms;

import static java.lang.Math.*;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a binary number:");
        double num=obj.nextInt();
        double num2=num;
        double sum=0;
        double y=0;
        while(num>0)
        {
            int x=(int) (num%10);
            sum=sum+(x*(pow(2,y)));
            num=num/10;
            y++;            
        }
        System.out.println("Decimal conversion of "+num2+" is:"+sum);        
    }    
}
