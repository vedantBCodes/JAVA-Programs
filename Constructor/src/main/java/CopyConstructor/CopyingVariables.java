/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CopyConstructor;

/**
 *
 * @author Lenovo
 */
public class CopyingVariables {
    int a;
    CopyingVariables()
    {
        a=10;
        System.out.println("In normal constructor:\na="+a);
    }
    CopyingVariables(CopyingVariables obj3)
    {
        a=obj3.a;
        System.out.println("In copy constructor:\na="+a);
    }
    public static void main(String[] args) {
      CopyingVariables obj1=new CopyingVariables();
      CopyingVariables obj2=new CopyingVariables(obj1);
    }
    
}
