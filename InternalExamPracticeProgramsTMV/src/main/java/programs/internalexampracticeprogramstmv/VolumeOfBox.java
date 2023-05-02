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
public class VolumeOfBox {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the length of box:");
        float len=obj.nextFloat();
        System.out.println("Enter the breadth of box:");
        float breadth=obj.nextFloat();
        System.out.println("Enter the height of box:");
        float height=obj.nextFloat();
        System.out.println("Volume of box:"+(len*breadth*height));        
    }   
}
