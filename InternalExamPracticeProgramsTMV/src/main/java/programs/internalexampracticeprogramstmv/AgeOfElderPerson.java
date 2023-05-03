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
public class AgeOfElderPerson {
     public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("How many members are there in your family:");
        int Asize=obj.nextInt();
        System.out.println("Enter the ages of all your family members("+Asize+"):");
        int arr[]=new int[Asize];
        for(int i=0;i<Asize;i++)
        {
            arr[i]=obj.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<Asize;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("The age of eldest person in your family is:"+max);
    }    
}
