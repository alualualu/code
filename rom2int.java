public static void main(String[] args)
    {
          Scanner sin = new Scanner(System.in);
        String s= sin.next();
        while(s.length()>1){
            System.out.print(s.charAt(1));
            System.out.print(s.charAt(0));
            s = s.substring(2);
        }
        System.out.println(s);
    }
}
