import java.util.*;
public class HashM {
    public static void main(String args[]){

        //Creation of HashMap-----------------------------------------------------------------------------------------------------
        HashMap<String ,Integer> map = new HashMap<>();

        //Insertion(Key,Value)----------------------------------------------------------------------------------------------------
        map.put("India",120);
        map.put("China", 150);
        map.put("US",50);
        map.put("US",80);
        System.out.println(map);

        //Searching key----------------------------------------------------------------------------------------------------------
        if(map.containsKey("India")){
            System.out.println("Present in the Map");
        }
        else{
            System.out.println("Not present in the Map");
        }

        //Enter key to get value-------------------------------------------------------------------------------------------------
        System.out.println(map.get("China"));          //exist
        System.out.println(map.get("Indonesia"));      //does not exist

        //Itertaion-------------------------------------------------------------------------------------------------------------
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.print(e.getKey()+" ");
            System.out.println(e.getValue());
        }

        //Remove----------------------------------------------------------------------------------------------------------------
        map.remove("China");
        System.out.println(map);




    }
    
}
