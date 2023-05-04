/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programs.arrayprograms;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int num=obj.nextInt();
        int num2=num;
        int sum=0;
        int i=1;
        while(num2>0)
        {
            int x=num2%2;
            sum=sum+(x*i);
            num2=num2/2;
            i=i*10;
        }
        System.out.println("Binary conversion of decimal number "+num+" is:"+sum);
    }
    
}
