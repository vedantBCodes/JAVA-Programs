/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programs.internalexampracticeprogramstmv;

/**
 *
 * @author Lenovo
 */
public class FinalKeyword {
    public static void main(String[] args) {
        final int a=10;
        System.out.println("Value of a:"+a);
        int b=20;
        System.out.println("Value of b:"+b);
        b++;
        System.out.println("The changed value of b is:"+b);
        //a++; You can't change the value of a because a is constant      
        }   
}
