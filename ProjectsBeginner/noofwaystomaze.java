class noofwaystomaze{
    public static int downandright(int i,int j,int n,int m){
        if(i==n||j==m){
            return 0;
        }
        if(i==n-1&&j==m-1){
            return 1;
        }

        int down=downandright(i+1, j, n, m);
       int right=downandright(i, j+1, n, m);
       return  down+right; 
    }
    public static void main(String[] args) {
        int total=downandright(0, 0, 3, 4);
        System.out.println(total);
    }
}