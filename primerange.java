 public static void main(String[] args) {
        // TODO code application logic here
        int flag=0,i,j;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the lower limit");
        int s1= s.nextInt();
        System.out.println("enter the upper limit");
        int s2= s.nextInt();
        System.out.println("prime numbers between in this range are");
        for(i=s1; i <= s2; i++)
              
        {
        for(j=2; j<i; j++)
        {
            if(i%j == 0)
            {    
        flag=0;
        break;
            }
            else
            {
                flag=1;
            }
            
            }
        if(flag==1)
        {
            System.out.println(i);
        }
        }
    }
}

        
