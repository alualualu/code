public static void main(String[] args) {
        // TODO code application logic here
         Scanner s=new Scanner(System.in);
          System.out.println("enter the number");
       int m= s.nextInt();
       int n=0;
      
      for(int i=2;i<= m/2;i++)
      {
           n = m%i
      }
      
          if(n==0)
          {
              
              System.out.println("not prime number");
      }
      
          else
          {
                  
              System.out.println("prime number");
          }
      
      
    }
    
}
