public class Stringreverse {
    public static void main(String args[]){
        StringBuilder sc = new StringBuilder("Duggu");

        //String reverse
        for(int i=0 ; i<sc.length()/2 ; i++){
            int front = i;                     //Store front index
            int back = sc.length()-1-i;          //store last index

            char frontchar = sc.charAt(front);       //store front letter
            char backchar = sc.charAt(back);          //store last letter

            sc.setCharAt(front,backchar);         //set lastletter at 1st index
            sc.setCharAt(back,frontchar);         //set firstletter at last index


            
        }

        System.out.println(sc);
    }
    
}
