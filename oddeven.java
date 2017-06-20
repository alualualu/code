import java.util.Scanner;


public class Pro1 {

    
    public static void main(String[] args) {
       
            {

        int n;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number you want to check:");

        n = s.nextInt();

        if(n %2==0)

        {

            System.out.println("The given number is even");

        }

        else if(n%2==1)

        {

            System.out.println("The given number is odd");

        }

        else

        {

            System.out.println("The given number "+n+" is neither odd nor even ");

        }

    }

}
    }
