import java.util.*;
public class Functions {

    public static void PrintMyName(String name){
        System.out.println(name);
        return;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name = ");
        String name = sc.nextLine();

        PrintMyName(name);
    }
    
}
