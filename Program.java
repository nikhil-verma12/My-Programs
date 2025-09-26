import java.util.*;

class Java {

    public static void main(String args[])
    {

        // Initialization of a Map using Generics
        Map<Integer, Integer> hm1
            = new HashMap<Integer, String>();

        // Inserting the Elements
        hm1.put(new Integer(1), "Geeks");
        hm1.put(new Integer(2), "For");
        hm1.put(new Integer(3), "Geeks");
        hm1.put(new Integer(4), "For");

        System.out.println(hm1);

        hm1.remove(new Integer(4));

        System.out.println(hm1);
    }
}