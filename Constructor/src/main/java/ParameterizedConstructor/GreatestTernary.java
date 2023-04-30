/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ParameterizedConstructor;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class GreatestTernary {
    GreatestTernary(int a,int b,int c)
    {
       int d=((a>b)?(a>c?a:c):(b>c?b:c));
        System.out.println("Grestest number is:"+d);
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter any 3 numbers:");
        int a=obj.nextInt();
        int b=obj.nextInt();
        int c=obj.nextInt();
        GreatestTernary obj2=new GreatestTernary(a,b,c);
    }
    
}
