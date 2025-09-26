public class selectionsort {
    public static void main(String args[]){
        int arr[] = {3,4,1,6,8,7,5};
        for(int i = 0 ; i<arr.length-1;i++){               // time complexity   O(n^2)
            int smallest = i;
            for(int j = i+1; j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
                }
                int temp = arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;
            }
            for(int i=0;i<arr.length;i++){
                System.out.print( arr[i]+" ");
            }
        }


       
    }
    

