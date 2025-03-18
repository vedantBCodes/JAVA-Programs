/*
Write a program to create three threads and set their priorities to MIN_PRIORITY,
NORM_PRIORITY, and MAX_PRIORITY. Observe the execution order and explain the
outcome.
 */

 class A extends Thread
{
    @Override
    public void run() {
        System.out.println("Printing A");
        for(int i=1;i<=5;i++)
        {
            System.out.print("A" + " ");
        }
        System.out.println();
    }
}
class B extends Thread
{
    @Override
    public void run() {
        System.out.println("Printing B");
        for(int i=1;i<=5;i++)
        {
            System.out.print("B" + " ");
        }
        System.out.println();
    }
}
class C extends Thread
{
    @Override
    public void run() {
        System.out.println("Printing C");
        for(int i=1;i<=5;i++)
        {
            System.out.print("C" + " ");
        }
        System.out.println();
    }
}
 public class question3 {
 
    public static void main(String[] args) 
    {
        A obj1 = new A();
        B obj2 = new B();
        C obj3 = new C();

        obj1.setPriority(Thread.MIN_PRIORITY);
        obj2.setPriority(Thread.NORM_PRIORITY);
        obj3.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        obj2.start();
        obj3.start();
        
    }
 }
