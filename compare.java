import java.util.*;
public class compare {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number = ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number = ");
        int b = sc.nextInt();
        if(a==b){
            System.out.println(a+"is equal to "+b);
        }
        else if(a>b){
            System.out.println(a+" is greater than "+b);
        }
        else{
            System.out.println(a+" is less than "+b);
        }

    } 
    
}
