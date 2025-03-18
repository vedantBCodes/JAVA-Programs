/*
 Using Vector collection, Write a Java Program to accept student names. Also display
students list in reverse order.
 */

import java.util.Collections;
import java.util.Vector;

public class question2 {
 
    public static void main(String[] args) {
        Vector<String> names = new Vector<>();
        names.add("Vedant");
        names.add("Suraj");
        names.add("Rahul");

        Collections.sort(names);
        System.out.println("Sorted vector : " + names);

        Collections.reverse(names);
        System.out.println("Reverse vector : " + names);
    }
 }
 