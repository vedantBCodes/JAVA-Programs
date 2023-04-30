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
public class AreaOfCircle {
 public static void main(String[] args) {
        double r;
        double area;
        System.out.println("Enter the radius of triangle:");
        Scanner obj=new Scanner(System.in);
        r =obj.nextDouble();
        area=(3.14*(r*r));
        System.out.println("Area of triangle:"+area);
    }       
 
    
}
