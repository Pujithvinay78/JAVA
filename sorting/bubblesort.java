class BubbleSort{
    public static void PrintArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    
    }
    public static void main(String[] args) {
        int arr[]={61,4,18,59,41,9,3,7,21,37,23,42,27,26};

        for(int i=0;i<arr.length-1;i++){
            for (int j = 0; j <arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                
            }
        }
        PrintArr(arr);

    }
}