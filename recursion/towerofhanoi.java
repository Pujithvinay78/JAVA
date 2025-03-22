class towerofhanoi{
    public static void towerofh(int n,String source,String helper,String dest){
        if(n==1){
            System.out.println("We move "+n+" from "+source+" to "+dest);
            return;
        }
        towerofh(n-1, source, dest, helper);
        System.out.println("We move "+n+" from "+source+" to "+dest);
        towerofh(n-1, helper, source, dest);
    }
    public static void main(String[] args) {
        int n=3;
        towerofh(n, "Source", "Helper", "Destination");
    }
}