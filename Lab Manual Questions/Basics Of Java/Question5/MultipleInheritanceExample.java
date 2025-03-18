/*

3. Write a Java program to demonstrate multiple inheritance using interfaces. 
Create two interfaces A and B, each with a method. Implement these interfaces in a class and display
output.

 */


interface A 
{
    void showA(); // Abstract method
}

interface B 
{
    void showB(); // Abstract method
}

class C implements A , B 
{
    
    @Override
    public void showA() 
    {
        System.out.println("Printing A");
    }

    @Override
    public void showB() 
    {
        System.out.println("Printing B");
    }
}

public class MultipleInheritanceExample 
{
    public static void main(String[] args) 
    {
       C obj = new C();
       obj.showA();
       obj.showB();
    }
}
