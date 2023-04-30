/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programs.stringprograms;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class OccuranceOfAllCharacters {
     void Occurance(String str)
    {
        int cnt,cnt2;
        for(int i=0;i<str.length();i++)
        {
            cnt=0;
          for(int j=0;j<str.length();j++)
          {
            if(str.charAt(j)==str.charAt(i))
            {
               cnt++;
            }
          }
          cnt2=0;
          for(int k=(i-1);k>=0;k--)
          {
              if(str.charAt(i)==str.charAt(k))
              {
                  cnt2++;
              }
          }
          if(cnt2==0)
          {
            System.out.println(str.charAt(i)+" occurs "+cnt+" times");
          }
        }
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=obj.nextLine();
        OccuranceOfAllCharacters obj2=new OccuranceOfAllCharacters();
        obj2.Occurance(str);
    }
    
}
