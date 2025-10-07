import java.util.*;
public class max_frequency {
    public static void main(String[] args) {
        int arr[] = {0, 2, 10,2,2,10,4, 4, 4,10,99,99,99,99,99,99,99, 10};
        Map<Integer,Integer> mp = new HashMap<>();
        int max_freq_element = arr[0];

        for(int el : arr){

            if(mp.containsKey(el)){
                mp.put(el, mp.get(el) + 1);
            }
            else{
                mp.put(el, 1);
            }

            if(mp.get(el) > mp.get(max_freq_element)){
                max_freq_element = el;
            }
        }
 
        System.out.println(max_freq_element + " --> " + mp.get(max_freq_element));
    }
    
}
