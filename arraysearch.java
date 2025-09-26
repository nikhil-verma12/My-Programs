import java.util.*;
public class arraysearch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size = ");
        int size = sc.nextInt();

        int marks[]= new int[size];
        System.out .println("Enter values - ");
        for(int i=0;i<size;i++){
            marks[i]=sc.nextInt();
        }

        System.out.print("Enter value to be search = ");
        int value=sc.nextInt();
        for(int i=0;i<size;i++){
            if(marks[i]==value){
                System.out.println("position of "+value+" is "+i);
            }
        }


    }
    
}
