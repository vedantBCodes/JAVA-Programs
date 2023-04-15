/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package basicprograms;

/**
 *
 * @author Lenovo
 */
public class Variables {
    static int a=10; //Static Variable declared
    int b=20; //Instance Variable declared
    void Method()
    {
        int c=30; //Local variable declared
        System.out.println("c:"+c);
    }
    public static void main(String[] args) {
         Variables obj4=new Variables();
        System.out.println("a:"+Variables.a);
        //non-static variables can be accessed by using class name
        //it can also accessed by creating object of class
        System.out.println("b:"+obj4.b);
        //instance variable can only be accessed bu creating the object of class
        obj4.Method();

    }
}
