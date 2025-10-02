import java.util.HashSet;
import java.util.Iterator;
public class Hashing {
    public static void main(String args[]){

        //creating HashSet
        HashSet<Integer> set = new HashSet<>();

        //Inserting
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(5);

        //printing
        System.out.println(set);

        //Searching-Contains element
        if(set.contains(2)){
            System.out.println("set contains 2");
        }
        if(!set.contains(10)){
            System.out.println("set does not contains 10");
        }

        //Size
        System.out.println(set.size());

        //Deletion
        set.remove(1);
        set.remove(2);
        System.out.println(set);

        //defining itertor
        Iterator it = set.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
            
        }
        
    
    }
    
}
