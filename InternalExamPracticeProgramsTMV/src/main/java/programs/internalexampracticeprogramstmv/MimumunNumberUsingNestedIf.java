/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programs.internalexampracticeprogramstmv;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class MimumunNumberUsingNestedIf {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a=obj.nextInt();
        int b=obj.nextInt();
        if(a!=b)
        {
            if(a>b)
            {
                System.out.println(b+" is minimun");
            }
            else
            {
                System.out.println(a+" is minimum");
            }
        }
        else
        {
            System.out.println("both are same");
        }
    }
    
}
