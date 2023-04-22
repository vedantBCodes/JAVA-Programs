/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DefaultConstructor;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class AverageOfMiddleArrayElements {
    AverageOfMiddleArrayElements()
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the size of array(enter add size:");
        int size=obj.nextInt();
        while(size%2==0)
        {
         System.out.print("Please Enter the odd size of array:");
        size=obj.nextInt();
        }
        int arr[]=new int[size];
        System.out.println("Enter any "+size+" array elements:");
        for(int i=0;i<size;i++)
        {
            arr[i]=obj.nextInt();
        }
       
    }
    public static void main(String[] args) {
        
        AverageOfMiddleArrayElements obj=new AverageOfMiddleArrayElements();    
    }
    
}
