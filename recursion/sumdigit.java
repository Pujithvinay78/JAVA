class sum{
    public static int func(int x) {
        if(x==0) return 0;
        return (x%10) + func(x/10);
        
    }
    public static void main(String[] args) {
        int x=99;
        System.out.println(func(x));
        
    }
}