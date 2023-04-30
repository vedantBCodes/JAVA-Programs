/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programs.arrayprograms;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class SortingArray {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int x=obj.nextInt();
        int arr[]=new int[x];
        System.out.println("Enter any "+x+" array elements:");
        for(int i=0;i<x;i++)
        {
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<x;i++)
        {
            for(int j=i+1;j<x;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for(int i=0;i<x;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
