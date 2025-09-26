import java.util.*;
public class strings {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // String name = sc.nextLine();    //if we want to return complete string then we use nextLine() otherwise use next()
        // System.out.println(name);
        
        //concatenation of strings
        // String fname = "Tony";
        // String lname = "Stark";
        // String fullname = fname + "@" +lname;      //we can add strings in between
        // System.out.println(fullname);               

        // //length of string
        // System.out.println(fullname.length());

        // //accessing each character of a string we use charAt()
        // for(int i=0 ; i< fullname.length() ; i++){
        //     System.out.println(fullname.charAt(i));
        // }
        

        // String s1 = "Tony";
        // String s2 = "Tony1";
        
        // if(s1.compareTo(s2)==0){                          //string comparison 
        //     System.out.println("string is Equal");
        // }
        // else{
        //     System.out.println("String is not equal");
        // }

        //subString 
        String s1 = "TonyStark";
        String name = s1.substring(4,s1.length());             //stringname.substring(beg indes,end index);
        System.out.println(name);

        
    }
    
}
