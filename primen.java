public static void main(String[] args) {
        // TODO code application logic here
        int i=1;
        boolean isprime=true;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        int n=s.nextInt();
        while(i<n)
        {
           if(n%i==0)
           {
               isprime=false;
               break;
           }
        
       
        }
        if(isprime=false)
        {
            System.out.println("not prime");
        }
        else
        {
              System.out.println("  prime "); 
    }
    }
}
    
        
        
