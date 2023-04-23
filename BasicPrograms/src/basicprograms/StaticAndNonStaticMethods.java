
package basicprograms;

//In this program we are calling static and non-static methods declared in the same class
public class StaticAndNonStaticMethods {
    static void StaticMethod()
    {
        System.out.println("Static Method called");
    }
    void NonStaticMethod()
    {
        System.out.println("Non-Static Method called");
    }
    public static void main(String[] args) {
        StaticAndNonStaticMethods obj3=new StaticAndNonStaticMethods();
        StaticMethod();
        //NOTE-STATIC METHODS CAN ACCESS STATIC METHODS 
        obj3.NonStaticMethod();
        //NOTE-STATIC METHODS CAN ACCESS NON-STATIC METHODS BY CREATING OBJECTS
    }
    
}
