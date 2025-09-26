import java.util.*;
public class oddsum{
    public static void sum_odd(int a){
        int sum=0;
        for(int i=1 ; i<=a ; i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        System.out.println(sum);
        return;

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        sum_odd(a);

    
    
}

   



}
