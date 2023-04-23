/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicprograms;

/**
 *
 * @author Lenovo
 */
//In this program we are calling static and non-static methods declared in the different class
public class StaticAndNonStaticMethods2 {
    
    public static void main(String[] args) {
        AnotherClass obj3=new AnotherClass();
        obj3.StaticMethod();
        //NOTE-STATIC METHODS CAN ACCESS STATIC METHODS BY USING CLASS-NAME
        //OF THE CLASS IN WHICH IT  IS DEFINED
        obj3.NonStaticMethod();
        //NOTE-STATIC METHODS CAN ACCESS NON-STATIC METHODS BY CREATING OBJECTS
    }    
}
class AnotherClass{//NOTE-THIS CLASS CAN'T BE PUBLIC BECAUSE ONE PROGRAM CAN HAVE ONLY ONE PUBLIC CLASS
     static void StaticMethod()
    {
        System.out.println("Static Method called");
    }
    void NonStaticMethod()
    {
        System.out.println("Non-Static Method called");
    }
}
