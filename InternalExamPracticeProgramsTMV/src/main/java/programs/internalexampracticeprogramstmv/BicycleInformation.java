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
public class BicycleInformation {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the information of bicycle you want:");
        System.out.println("Enter the company name of bicycle you want:");
        String bname=obj.nextLine();
        System.out.println("Enter the range of prize within which you can afford a bicycle:");
        String brange=obj.nextLine();
        System.out.println("Do you want bicycle with gear or without gear:");
        System.out.println("Enter 'gear' for gear bicycle\nEnter 'No gear' for without gear bicycle:");
        String gear=obj.nextLine();
        System.out.println("SO YOU WANT A "+bname+" BICYCLE WITHIN "+brange+" range and with "+gear);
        
    }
    
}
