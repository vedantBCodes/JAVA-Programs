
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class AreaOfTriangle {
    public static void main(String[] args) {
        float b,h,area;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the value of base:");
        b=obj.nextFloat();
        System.out.println("Enter the value of height:");
        h=obj.nextFloat();
        area=((b*h)/2);
        System.out.println("Area of Triangle with base "+b+"cm and height "+h+"cm is:"+area+"cm square");
    }
    
}
