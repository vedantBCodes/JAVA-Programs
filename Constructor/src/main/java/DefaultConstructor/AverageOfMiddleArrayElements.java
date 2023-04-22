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
        int i,j;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the size of array(enter even size):");
        int size=obj.nextInt();
        while(size%2!=0)
        {
         System.out.print("Please Enter the even size:");
        size=obj.nextInt();
        }
        int arr[]=new int[size];
        System.out.println("Enter any "+size+" array elements:");
        for( i=0;i<size;i++)
        {
            arr[i]=obj.nextInt();
        }
        for(i=0;i<size;i++)
        {
          for(j=i+1;j<size;j++)
          {
              if(arr[i]>arr[j])
              {
                  int temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
              }
          }
        }
        System.out.print("Sorted array:");
        for( i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }       
        float avr;
        int x=(size/2);
        avr=(float)(arr[x-1]+arr[x])/2;
        System.out.println("\nMiddle 2 array elements are "+arr[x-1]+" and "+arr[x]);
        System.out.println("And it's average is:"+avr);
        
    }
    public static void main(String[] args) {
        
        AverageOfMiddleArrayElements obj=new AverageOfMiddleArrayElements();    
    }
    
}
