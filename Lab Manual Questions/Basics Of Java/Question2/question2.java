/*

2.Implement a program to demonstrate hierarchical inheritance:
• Base class Vehicle with fields make and model.
• Derived classes Car and Bike that extend Vehicle.
• Add unique methods to both derived classes and display their features

 */

class Vehicle
{
    String make;
    String model;
    public void makeAndModel(String make,String model)
    {
        this.make=make;
        this.model=model;
    }
}
class Car extends Vehicle
{
    @Override
    public void makeAndModel(String make, String model) {
        System.out.println("Make : "+ make + "\nModel : "+ model);
    }
    public void carDetails()
    {
        System.out.println("Car details : \nprice : $1234 \nColor : White\n");
    }
}

class Bike extends Vehicle
{
    @Override
    public void makeAndModel(String make, String model) {
        System.out.println("Make : "+ make + "\nModel : "+ model);
    }
    public void bikeDetails()
    {
        System.out.println("Bike details : \nprice : $3412 \nColor : Black");
    }
}
public class question2 
{
    public static void main(String[] args)
    {
        Car obj1=new Car();
        obj1.makeAndModel("USA", "Thar");
        obj1.carDetails();
        Bike obj2=new Bike();
        obj2.makeAndModel("India", "Honda");
        obj2.bikeDetails();
    }
}
