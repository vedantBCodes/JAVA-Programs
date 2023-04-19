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
public class AgeOfPerson {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter your date of birth(dd/mm/yy):");
        int bday=obj.nextInt(); //bdate-birth date
        int bmonth=obj.nextInt();//bmonth-birth month
        int byear=obj.nextInt(); //byear-birth year
        System.out.print("Enter current date(dd/mm/yy):");
        int pday=obj.nextInt(); //pdate-present date
        int pmonth=obj.nextInt();//pmonth-present month
        int pyear=obj.nextInt(); //pyear-present year
        int dday,dmonth,dyear; //d-difference
        if(pday<bday)
        {
            switch(pmonth-1)
            {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                {
                    pday=pday+31;
                    pmonth=pmonth-1;
                    break;
                }
                case 4:
                case 6:
                case 9:
                case 11:
                {
                    pday=pday+30;
                    pmonth=pmonth-1;
                    break;
                }
                case 2:
                {
                   if((pyear%100==0)&&(pyear%400==0)||(pyear%100!=0)&&(pyear%4==0))
                  {
                    pday=pday+29;
                    pmonth=pmonth-1;
                    break;
                  }
                   else
                   {
                    pday=pday+28;  
                    pmonth=pmonth-1;
                    break;
                   }
                }
            }
            }
        if(pmonth<bmonth)
        {
            pmonth=pmonth+12;
            pyear=pyear-1;
        }
        dyear=pyear-byear;
        dmonth=pmonth-bmonth;
        dday=pday-bday;
        if(dyear==0)
        {
           System.out.println("You are "+dmonth+" months and "+dday+" days old!"); 
        }
        else if((dmonth==0)&&(dday==0))
        {
            System.out.println("You are "+dyear+" years old!"); 
        }
        else if(dmonth==0)
        {
           System.out.println("You are "+dyear+" years and "+dday+" days old!"); 
        }
        else if(dday==0)
        {
           System.out.println("You are "+dyear+" years and "+dmonth+" months old!"); 
        }        
        else
        {
            System.out.println("You are "+dyear+" years,"+dmonth+" months and "+dday+" days old!");
        }
    }
    
}
