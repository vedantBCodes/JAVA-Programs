/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programs.specialjavaprograms;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ConvertingDaysIntoYearsMonthsAndDays {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of days:");
        int days=obj.nextInt();
        int temp=days;
        int yr=0;
        int wk=0; //yr is for year and wk is for week
        if(days>=365)
        {
            yr=(days/365); 
        days=days-(yr*365);
        }
        if(days>=7)
        {
            wk=(days/7);
            days=days-(wk*7);
        }
        System.out.print(temp+" days contains ");
        if(yr>0)
        {
            System.out.print(yr+" year ");
        }
        if(wk>0)
        {
            System.out.print(wk+" weeks");
        }
        if(days>0)
        {
            System.out.print(" and "+days+" days");
        }
    }  
}
