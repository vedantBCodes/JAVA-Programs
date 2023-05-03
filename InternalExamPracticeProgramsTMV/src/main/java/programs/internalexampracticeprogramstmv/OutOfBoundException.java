/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programs.internalexampracticeprogramstmv;

import java.util.Scanner;
class MarksOutOfBoundException extends Exception {
    public  MarksOutOfBoundException(String s)
    {
       
    }
}     //INCOMPLETE PROGRAM

/**
 *
 * @author Lenovo
 */
public class OutOfBoundException {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter your marks:");
        int marks=obj.nextInt();
        try{
        if(marks<=100)
        {
        System.out.println("You got "+marks+" marks");
        }
        else
        {
        throw new MarksOutOfBoundException("you can't get marks out of bound");
        }        
        }
        catch(MarksOutOfBoundException x)
        {
            System.out.println(x);
        }
        System.out.println("Execution completed");
    }    
}
