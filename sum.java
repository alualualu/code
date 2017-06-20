

import java.util.Scanner;


public class Pro1 {

    
    public static void main(String[] args) {
       
            {
              

        int n,p,num,sum=0,i;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the no number:");

        n = s.nextInt();
        System.out.print("Enter the  number:");
        
        for(i=0; i<n; i++)
        {
            num=s.nextInt();
            sum = sum+num;
        }
           System.out.print("the result is:"+sum);
           }
