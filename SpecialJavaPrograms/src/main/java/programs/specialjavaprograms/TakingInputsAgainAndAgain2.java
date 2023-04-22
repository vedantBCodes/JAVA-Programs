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
public class TakingInputsAgainAndAgain2 {
    public static void main(String[] args) {
        int num;
        do{
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter an even number:");
        num=obj.nextInt();
        }
        while(num%2!=0);
    }
    
}
