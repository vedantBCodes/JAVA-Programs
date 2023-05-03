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
public class UseOf2DArray {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of rows you want to create:");
        int rows=obj.nextInt();
        System.out.println("Enter the number of column you want to create:");
        int column=obj.nextInt();
        int i,j;
        int arr[][]=new int[rows][column];
        int size=(rows*column);
        System.out.println("Enter any "+size+" array elements:");
        for(i=0;i<rows;i++)
        {
            for(j=0;j<column;j++)
            {
                arr[i][j]=obj.nextInt();
            }
        }
        System.out.println("Entered 2D array is:");
        for(i=0;i<rows;i++)
        {
            for(j=0;j<column;j++)
            {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.print("\n");
        }
    }
    
}
