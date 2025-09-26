public class SumIteration {
    public static void SumN(int i,int n,int sum){
       
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return ;
        }
       sum+=i;
        SumN(i+1,n,sum);

     } 
    public static void main(String args[]){
        int i = 0;
        int sum = 0;
        int n=5;
        SumN(i,n,sum);
    }
    
}
   