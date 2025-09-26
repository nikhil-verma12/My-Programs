import java.util.*;
public class bitcalculate{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //to get bit
         int a = 5;    //0101
         int pos = 1;     //position
         int bitmask = 1<<pos;
         
         if((a&bitmask)==0){
            System.out.println("0");
         }
         else{
            System.out.println("1");
         }


         //to set bit
         int c = bitmask|a;
         System.out.println(c);       //set 0111 
         
         
         //clear bit
         int d = ~bitmask;
         int e = d&a;
         System.out.println(e);


         //update bit
         System.out.println("Enter 0 or 1 = ");
         int update = sc.nextInt();
         if(update==0){
            System.out.println(e);
         }
         else{
            System.out.println(c);
         }




    }

}