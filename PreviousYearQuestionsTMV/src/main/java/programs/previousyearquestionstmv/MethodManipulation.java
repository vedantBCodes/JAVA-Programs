package programs.previousyearquestionstmv;

import java.util.Scanner;

public class MethodManipulation {
    public static void main(String[] args) {
        String name;
        int marks[]=new int[5];
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the name of a student:");
        name=obj.next();
        System.out.println("Enter the marks in 5 subject:");
        for(int i=0;i<5;i++)
        {
            marks[i]=obj.nextInt();
        }
        Student obj2=new Student();
        obj2.Total(name,marks);
        obj2.Percentage(marks);        
    }    
}
class Student{
    void Total(String name,int marks[])
    {
        int sum=0,i;
        for(i=0;i<5;i++)
        {
            sum=sum+marks[i];
        }
        System.out.println("Name:"+name+"\nTotal marks:"+sum);
    }
    void Percentage(int marks[])
    {
        int sum=0,i,per;
        for(i=0;i<5;i++)
        {
            sum=sum+marks[i];
        }
        per=(sum*100)/500;
        System.out.println("Percentage:"+per);
    }
}
