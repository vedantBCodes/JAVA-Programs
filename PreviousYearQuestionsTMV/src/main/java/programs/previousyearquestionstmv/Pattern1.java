/*
1 1 1 1 
0 0 0
1 1 
0
*/
package programs.previousyearquestionstmv;

/**
 *
 * @author Lenovo
 */
public class Pattern1 {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=4;i++)
        {
            for(j=4;j>=i;j--)
            {
                System.out.print(i%2+" ");
            }
            System.out.print("\n");
        }
    }
    
}
