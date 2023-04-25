/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programs.exceptionhandling;

/**
 *
 * @author Lenovo
 */
public class TryCatchBlock {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int c;
        System.out.println("Main method started");
        try{
            c=a/b;
            System.out.println("c="+c);
        }
        catch(ArithmeticException e){
            System.out.println("Number can't be devide by zero");            
        }
        System.out.println("Main method ended");
    }    
}
