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
public class LargestArrayElement {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int Asize=obj.nextInt();
        System.out.println("Enter any "+Asize+" array elements:");
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
        System.out.println("Largest element:"+max);
    }
    
}
