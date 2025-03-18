/*
Write a Java Program to store student names in ArrayList. Provide the list of students
whose name begins with “S”. Also implement the add, remove, removeAll, removeIf,
retainAll, equals methods of ArrayList. Also perform validations like ArrayList is empty.
 */

import java.util.ArrayList;

public class question1 
{
    public static void main(String[] args) 
    {
        ArrayList<String> names = new ArrayList<>();
        names.add("Vedant");
        names.add("Suraj");
        names.add("Vinod");
        names.add("Sanjay");
        names.add("Vijay");

        System.out.println("Students with name begins with 'S : ");
        for(String items : names)
        {
            if(items.startsWith("S"))
            {
                System.out.print(items + " ");
            }
        }
        System.out.println();
        System.out.println(names);


        // Add 
        names.add("Ritesh");
        names.add(1,"Rajkumar");
        System.out.println(names);


        // Remove
        names.remove("Sanjay");
        names.remove(3);
        System.out.println(names);

         // RemoveAll
        //  names.removeAll(names);
        //  System.out.println(names);

          // RemoveIf
          names.removeIf((name)-> name.startsWith("V"));
          System.out.println(names);

        //   equals methods 

        ArrayList <String> names2 = new ArrayList<>();
        names2.add("Suraj");
        names2.add("Rahul");

        boolean check= names.equals(names2);
        System.out.println(check);

        // Check for empty ArrayList

        boolean check2=names.isEmpty();
        System.out.println(check2);

        // Clearing all items in ArrayList
        names.clear();
        check2=names.isEmpty();
        System.out.println(check2);

    }
    
}