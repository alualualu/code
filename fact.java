 public static void main(String[] args) {
        int n,i,j,fact=1;
        Scanner s = new Scanner(System.in);
        System.out.println("enter no to find factorial");
        n= s.nextInt();
        for(i=1;i<=n;i++)
        {
            fact=i*fact;
        }
        System.out.println("factorial"+fact);
    }}
    
