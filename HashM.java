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
        map.put("Pakistan",10);
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

        //Iteration Method 1----------------------------------------------------------------------------------------------------
        for(String Key : map.keySet()){
            System.out.print(Key+"->"+map.get(Key)+" ");
        }
        System.out.println();

        //Itertaion Method 2----------------------------------------------------------------------------------------------------
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.print(e.getKey()+"--->"+e.getValue()+" ");
            
        }
        System.out.println();

        //Iteration------------------------------------------------------------------------------------------------------------
        for(var e : map.entrySet()){
            System.out.print(e.getKey()+"--->>"+e.getValue()+" ");

        }

        //Remove----------------------------------------------------------------------------------------------------------------
        map.remove("China");
        System.out.println(map);

        System.out.println(map.size());  // Size of the hashmap


        map.putIfAbsent("Pakistan",5 );  // this will not enter
        map.putIfAbsent("Australia",5 );   // this will enter 
        System.out.println(map);

        System.out.println(map.keySet()); //give all the keys
        System.out.println(map.values());  // give all the values
        System.out.println(map.entrySet());  // give all the Keys along with Values





    }
    
}
   