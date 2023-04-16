package programs.previousyearquestionstmv;
//IMPORTANT NOTE:Strings are immutable
import java.util.Scanner;
public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String str;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a string containing duplicate characters:");
        str=obj.nextLine();
        RemoveDuplicates(str);
    }
    static void RemoveDuplicates(String str)
    {
        String str2="";
        int k=0;
        int length=str.length();
        for(int i=0;i<length;i++)
        {
           int cnt2=0;
                for(int x=0;x<k;x++)
                {
                    if(str.charAt(i)==str2.charAt(x))
                    {
                        cnt2++;
                    }
                }
                if(cnt2==0)
                {
                str2=str2+str.charAt(i);
               // str2.charAt(k)=str.charAt(i);
                k++;
                }
        }
        System.out.println("Entered string after removing duplicate characters is:"+str2);
    }    
}
