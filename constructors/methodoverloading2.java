

class cloud {
    String name;
    double magnitude;
    void types(){
        name="columbus";
        magnitude=10.0;
        System.out.println("The name of the cloud is "+name+" and the magnitude is "+magnitude);
    }
    void types(String name,double magnitude){
        this.name=name;
        this.magnitude=magnitude;
        System.out.println("The name of the cloud is "+name+" and the magnitude is "+magnitude);
    }

    void types(String name,double magnitude,int time){

        this.name=name;
        this.magnitude=magnitude;
        System.out.println("The name of the cloud is "+name+" and the magnitude is "+magnitude+ " and the time is "+time);
    }
    public static void main(String[] args) {
        cloud sc=new cloud();
        sc.types();
        sc.types("black",4.0);
        sc.types("blue",1.0, 10);
    }
}