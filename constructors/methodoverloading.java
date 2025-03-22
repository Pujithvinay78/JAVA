
class overloading{

    int add(int a,int b){
        return a+b;

    }
    int add(int a,int b,int c,int d){
        return a+b+c+d;
    }
    public static void main(String[] args) {
        overloading obj=new overloading();
        System.out.println("The first one is "+obj.add(12, 4));
        System.out.println("the second one is"+obj.add(15, 2, 43, 234));
            }
}