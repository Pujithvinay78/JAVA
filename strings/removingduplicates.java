class Alphabet{
    public static boolean map[]=new boolean[26];
    public static void RemoveDuplicates(String str,int index,String newstr) {
        if(index==str.length()){
            System.out.println(newstr);
            return;
        }

        char currChar=str.charAt(index);
        if(map[currChar-'a']==true){
            RemoveDuplicates(str, index+1, newstr);
        }
        else{
            newstr+=currChar;
            map[currChar-'a']=true;
            RemoveDuplicates(str, index+1, newstr);
        }
        }
    public static void main(String[] args) {
        String str="asugfroiufgheruhgoriuhgoue";
        RemoveDuplicates(str, 0,"");
    }
}