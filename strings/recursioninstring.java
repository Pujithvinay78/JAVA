class Addtheelement{
    public static void stringadd(String str,int count,int indx,String newstr) {
        if(indx==str.length()){
            for(int i=0;i<count;i++){
                newstr+='x';
            }
            System.out.println(newstr);
            return;
        }

        char currChar=str.charAt(indx);
        if(currChar=='x'){
            stringadd(str, count+1, indx+1, newstr);
        }
        else{
            newstr+=currChar;
            stringadd(str, count, indx+1, newstr);
        }

        }
    public static void main(String[] args) {
        String str="axbcxxd";
        stringadd(str, 0, 0, "");
    }
}