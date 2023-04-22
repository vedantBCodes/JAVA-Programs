/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DefaultConstructor;

public class HollowRectanglePattern {
    HollowRectanglePattern()
    {
        int i,j;
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=8;j++)
            {
                if((i==1)||(i==4))
                {
                   System.out.print("* ");    
                }
                else if((j>1)&&(j<8))
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print("* ");
                }
                
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        {
            HollowRectanglePattern obj=new HollowRectanglePattern(); //constructor called
        }
    }
}
