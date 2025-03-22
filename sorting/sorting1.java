class SortingtheArray{

    public static void min(int arr[]) {
         for(int i=1;i<arr.length;i++){
          System.out.println(arr[i]);
              
         }
    }
    public static void main(String[] args) {
        int arr[]={9,7,6,8,5,3,4,2,11,2};

        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;

            while(arr[j]>key&&j>=0){
                arr[j+1]=j;
                j--;
            }

            arr[j+1]=key;
        }
        min(arr);

    }
}