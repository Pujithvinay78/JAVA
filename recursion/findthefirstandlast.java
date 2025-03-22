class a2irst{
   static int first=-1;
   static int last=-1;

public static void mai(String x,int index,char element) {
    if(index==x.length()){
        System.out.println(first);
        System.out.println(last);
        return;
    }
    char current=x.charAt(index);
    if(current==element){
        if(first==-1){
            first=index;
       }
       else{
        last=index;
       }
    }
    mai(x, index+1, element);
    
}
public static void main(String[] args) {
    String x="ahahahhahahahhaaa";
    mai(x, 0, 'a');
    
}
}