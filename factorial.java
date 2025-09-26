import java.util.*;
public class factorial {
    public static void factorialfun(int a){
        //check whether number is negative or not!
        if(a<0){
            System.out.println("Enter Valid Number!!!!");
            return ;
        }
        int fact = 1;
        for(int i=1 ; i<a+1 ; i++){
            
            fact *= i;
        }
        System.out.println(fact);
        return;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        factorialfun(a);

        
    }
    
}
