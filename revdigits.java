public static void main(String[] args)
    {
        int n,reverse=0;
    
       Scanner s = new Scanner(System.in);
        System.out.println("enter no to reverse");
        n= s.nextInt();
        

     while( n != 0 )
      {
          reverse = reverse * 10;
          reverse = reverse + n%10;
          n = n/10;
      }
         System.out.println(" reverse number"+reverse);
    }
}
