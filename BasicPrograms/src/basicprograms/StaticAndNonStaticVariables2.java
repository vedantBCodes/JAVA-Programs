/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicprograms;

/**
 *
 * @author Lenovo
 */
public class StaticAndNonStaticVariables2 {
     
    public static void main(String[] args) {
        AnotherClass obj3=new AnotherClass();
        System.out.println("a:"+obj3.a);
        //AS MAIN IS A STATIC METHOD IT CAN ACCESS ONLY STATIC VARIABLES
        System.out.println("b:"+obj3.b);
        //STATIC METHODS CAN ACCESS NON-STATIC VARIABLES BY CREATING OBJECT OF CLASS
    }     
}
class AnotherClass{
    static int a=10;  //Static variable
    int b=20;   //Non-static variables OR instance variable
     static void StaticMethod()
    {
        System.out.println("In Static Method:\n a="+a);
        //NOTE -STATIC METHODS CAN ACCESS ONLY STATIC METHODS
    }
    void NonStaticMethod()
    {
        System.out.println("In Non-Static Method\n a="+a+"\n b="+b);
        //NOTE -NON-STATIC METHODS CAN ACCESS BOTH STATIC AND NON-STATIC VARIABLES
    }
    
}
