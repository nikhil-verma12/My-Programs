class selectnsort {
    public static int[] selectnSort(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            int temp =i;
            for(int j=i ; j<arr.length ; j++){
                if(arr[temp]>arr[j]){
                   temp = j;
                }
            }
            int t = arr[i];
            arr[i]=arr[temp];
            arr[temp] = t;
            
        }
        return arr;
    }
    
    public static void main(String[] args) {
        int arr[] = {5,9,51,15,54,5,2,4,55,4,5,45,4,5,4,54,54,98,94};
        int[] result = selectnSort(arr);
        for(int i = 0 ;i< result.length  ; i++){
            System.out.print(result[i]+",");
        }
    }
}