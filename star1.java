public class star1 {
    public static void main(String args[]){
        int n = 5;
        int m = 6;
        for(int i=1 ; i<n ; i++){
            for(int j=1 ; j<m ; j++){
                if(i==1 || j==1 || i==n-1 || j==m-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
