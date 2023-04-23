
package basicprograms;

//In this program we are calling static and non-static methods declared in the same class
public class StaticAndNonStaticMethods {
    static void StaticMethod()
    {
        System.out.println("Static Method called");
    }
    void NonStaticMethod1()
    {
        System.out.println("Non-Static Method-1 called");
        StaticMethod();
        NonStaticMethod2();
        //NOTE-NON STATIC METHOD CAN ACCESS BOTH STATIC AND NON-STATIC METHODS
    }
     void NonStaticMethod2()
    {
        System.out.println("Non-Static Method-2 called");
    }
    public static void main(String[] args) {
        StaticAndNonStaticMethods obj3=new StaticAndNonStaticMethods();
        StaticMethod();
        //NOTE-STATIC METHODS CAN ACCESS STATIC METHODS 
        obj3.NonStaticMethod1();
        obj3.NonStaticMethod2();
        //NOTE-STATIC METHODS CAN ACCESS NON-STATIC METHODS BY CREATING OBJECTS
    }
    
}
