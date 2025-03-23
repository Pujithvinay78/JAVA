class tree{
    String color;
    int age;

    tree(){
        color="yellow";
        age=12;

    }

    tree(String z,int x){
        color=z;
        age=x;

    }
    void display(){
        System.out.println("The color of the tree is "+color+" while the age is "+age);
    }
}
class mained{
    public static void main(String[] args) {
        tree sc=new tree();
        tree sc1=new tree("pink",3);
        sc.display();
        sc1.display();
    }
}