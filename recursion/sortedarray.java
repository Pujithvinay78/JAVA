
class sort{
    public static boolean Checkthearray(int arr[],int index) {
    if(index==arr.length-1){
        return true;
    }
    
    if(arr[index]<arr[index+1]){
        return Checkthearray(arr, index+1);
    }
    else{
        return false;
    }
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        System.out.println(Checkthearray(arr, 0));
    }
}