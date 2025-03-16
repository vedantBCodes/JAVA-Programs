/*

1. Write a Java program to create an abstract class Shape with the following :

• An abstract method calculateArea() .
• A concrete method display() that displays the type of shape.
• Create two subclasses: Circle and Rectangle.
• Implement the calculateArea() method in both subclasses and display the areas.

 */

abstract class Shape
{
    public abstract void calculateArea();
    public void display(String name)
    {
        System.out.println("Shape :" + name);
    }
}
class Circle extends Shape
{
    int r;
    Circle(int r)
    {
        this.r=r;
    }
    @Override
    public void calculateArea() 
    {
        double area = 3.14 * (r*r);
        System.out.println("Area of circle :" + area);
    }
}

class Rectangle extends Shape
{
    int l,b;
    Rectangle(int l,int b)
    {
        this.l=l;
        this.b=b;
    }
    @Override
    public void calculateArea() 
    {
        double area = (l*b);
        System.out.println("Area of rectangle :" + area);
    }
}
public class question1 {

    public static void main(String[] args) 
    {
        Circle obj1= new Circle(2);
        obj1.display("Circle");
        obj1.calculateArea();
        obj1.display("Rectangle");
        Rectangle obj2= new Rectangle(2,4);
        obj2.calculateArea();
    }
}