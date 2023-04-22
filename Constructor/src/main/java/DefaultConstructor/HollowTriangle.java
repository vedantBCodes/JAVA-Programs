/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DefaultConstructor;

/**
 *
 * @author Lenovo
 */
public class HollowTriangle {
    HollowTriangle()
    {
        int i,j,k=5,x=0;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                if(j==k)
                {
                    System.out.print("* ");
                    k--;
                }
                else if(i==5)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            if(i>1)
         {
            for(int m=1;m<=5;m++)
            {
                if(m==x)
                {
                    System.out.print("* ");
                }
                else if(i==5)
                {
                    if(m<5)
                    {
                    System.out.print("* ");
                    }
                }
                else
                {
                    System.out.print("  ");
                }  
            }
         }
            System.out.println();
            x++;
        }
    }
    public static void main(String[] args) {
        HollowTriangle obj=new HollowTriangle();
    }
    
}
