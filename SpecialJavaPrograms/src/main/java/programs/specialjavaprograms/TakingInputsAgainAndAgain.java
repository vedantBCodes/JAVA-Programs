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
public class TakingInputsAgainAndAgain {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter an even number:");
        int num=obj.nextInt();
        while(num%2!=0)
        {
            System.out.println("You entered odd number:");
            System.out.println("Please enter any even number:");
            num=obj.nextInt();//One can take input of same number more than 1 time            
        }
        System.out.println("You entered right number");
    }
    
}
