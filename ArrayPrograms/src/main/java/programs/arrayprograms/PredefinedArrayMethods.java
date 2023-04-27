/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programs.arrayprograms;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class PredefinedArrayMethods {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int x=obj.nextInt();
        int arr1[]=new int[x];
        int arr2[]=new int[x];
        int arr3[]=new int[x];
        System.out.println("Enter any "+x+" array elements to do sorting:");
        for(int i=0;i<x;i++)
        {
            arr1[i]=obj.nextInt();
        }
        Arrays.sort(arr1);
        System.out.print("Sorted array elements are:");
        for(int z:arr1)
        {
            System.out.print(z+" ");
        }
System.out.println("\nEnter another "+x+" array element to check whether it is equal to the previous sorted array or not:");
        for(int i=0;i<x;i++)
        {
            arr2[i]=obj.nextInt();
        }
        boolean a=Arrays.equals(arr1, arr2);
        if(a==true)
        {
            System.out.println("Entered array is equal to previous sorted array");
        }
        else
        {
            System.out.println("Entered array is not equal to previous sorted array");
        }
        System.out.println("Now we are copying the sorted array elements into another empty array:");
        System.out.print("The copied array elements are:");
        arr3=Arrays.copyOf(arr1,5);
        for(int z:arr3)
        {
            System.out.print(z+" ");
        }
    }
    
}
