/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programs.specialjavaprograms;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class TakingInputsAgainAndAgain3 {     
    int num;
     void input()
     {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter an even number:");
        num=obj.nextInt();
     }
    public static void main(String[] args) {
        TakingInputsAgainAndAgain3 obj2=new TakingInputsAgainAndAgain3();       
        obj2.input(); 
        while((obj2.num%2)!=0)
        {
            System.out.println("You entered odd number:");
            obj2.input();          
        }
        System.out.println("You entered right number");
    }
    
}
