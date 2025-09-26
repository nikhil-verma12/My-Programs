import java.util.*;
public class LL1 {
    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<String>();
        
        //add at first
        list.addFirst("is");
        list.addFirst("This");
        //add at Last
        list.add("a");
        list.addLast("list");
        
        //size of list
        System.out.println(list.size());

        //get element, list.get(indexvalue)
        for(int i=0 ; i<list.size() ; i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("null");
        //deleting value
        list.removeFirst();
        list.removeLast();
        for(int i=0 ; i<list.size() ; i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("null");
        

    }
    
}
