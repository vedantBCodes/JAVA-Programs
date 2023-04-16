/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programs.previousyearquestionstmv;

import java.util.Scanner;


public class TableMaking {
    public static void main(String[] args) {
        int num,i;
        System.out.println("Enter a number:");
        Scanner obj=new Scanner(System.in);
        num=obj.nextInt();
        System.out.println("Table of "+num+":");
        for(i=1;i<=10;i++)
        {
            System.out.println(num+"*"+i+"="+num*i);
        }        
    }    
}
