/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programs.exceptionhandling;

/**
 *
 * @author Lenovo
 */
public class NullPointerException {
    public static void main(String[] args) {
        String str=null;
        try{
            System.out.println(str.toUpperCase());
        }
        catch(Exception x){
            System.out.println(x);
            
        }
    }
    
}
