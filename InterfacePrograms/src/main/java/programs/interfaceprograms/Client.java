/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package programs.interfaceprograms;

import java.util.Scanner;
public interface Client {
    void input();  //BY DEFALUT IT IS Public AND Abstract
    void output(); //BY DEFALUT IT IS Public AND Abstract    
}
class developer implements Client
{
    String name;
    double sal;
    @Override
    public void input()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter username:");
        name=obj.nextLine();
        System.out.println("Enter salary:");
        sal=obj.nextDouble();
    }
    @Override
    public void output()
    {
        System.out.println("Usename:"+name+"\nSalary:"+sal);
    }
    public static void main(String[] args) {
        Client obj2=new developer();
        obj2.input();
        obj2.output();
    }
}

