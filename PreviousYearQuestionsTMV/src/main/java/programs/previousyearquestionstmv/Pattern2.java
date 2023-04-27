/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programs.previousyearquestionstmv;

/**
 *
 * @author Lenovo
 */
public class Pattern2 {
     public static void main(String[] args) {
        int i,j,k;
        for(i=1;i<=4;i++)
        {
            for(j=4;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
   
}
