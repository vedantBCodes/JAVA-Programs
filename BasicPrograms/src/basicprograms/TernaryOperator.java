/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicprograms;

/**
 *
 * @author Lenovo
 */
public class TernaryOperator {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        int d=(a>b?a:b);
        System.out.println("Greater number between "+a+" and "+b+" is:"+d);
        int e=((a>b)?(a>c?a:c):(b>c?b:c));
        System.out.println("Greatest number between "+a+" "+b+" and "+c+" is:"+e);        
    }
    
}
