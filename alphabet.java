package pro1;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Pro1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
            {
              /*  int n;
            
                for(i=1;i<6;i++)
                {
                    System.out.println ("hello");
                }
            }*/

        int n;

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the character");
        n = s.next(). charAt(0);
       // int len=(int)Math.log10(n)+1;
        if((n>='a'&&n<='z')||(n>='A'&&n<='Z'))
        {
        System.out.println("ALPHABET");
        }
        else
        {
             System.out.println("not ALPHABET");
        }
