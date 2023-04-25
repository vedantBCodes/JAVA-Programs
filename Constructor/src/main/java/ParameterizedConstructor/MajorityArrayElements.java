/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ParameterizedConstructor;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class MajorityArrayElements {
    MajorityArrayElements(int arr[],int x)
    {
        int i,j;
        int cnt;
        int max=0;
        int num1=0;
        for(i=0;i<x;i++)
        {
            cnt=0;
            for(j=0;j<x;j++)
          {
            if(arr[i]==arr[j])
            {
                cnt++;
            }  
          }
            if(cnt>max)
            {
                max=cnt;
                num1=arr[i];
            }
        }
        if(max==1)
            {
                System.out.println("NO array element occurs more than 1 times");
            }
        else
        {
        System.out.println("Majority array element is:"+num1);
        System.out.println(num1+" occurs "+max+" times");
        }
    }
    
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
        MajorityArrayElements obj2=new MajorityArrayElements(arr,x);
    }
    
}
