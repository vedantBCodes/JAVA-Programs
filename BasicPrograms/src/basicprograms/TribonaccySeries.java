/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicprograms;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class TribonaccySeries {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter how many first numbers of tribonaccy series you want to print:");
        int num=obj.nextInt();
        int a=0;
        int b=1;
        int c=1;
        System.out.print("Tribonaccy series:"+a+" "+b+" "+c+" ");
        for(int i=2;i<num;i++)
        {
            int d=a+b+c;
            System.out.print(d+" ");
            a=b;
            b=c;
            c=d;
        }
    }
    
}
