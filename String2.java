public class String2 {
    public static void main(String args[]){
          StringBuilder sc = new StringBuilder("Tony");

          System.out.println(sc);

          //char at index 0 
          System.out.println(sc.charAt(0));

          //set any char at any index
          sc.setCharAt(0,'N');
          System.out.println(sc);

          //inserting char
          sc.insert(2,'n');
          System.out.println(sc);


          //deletion
          sc.delete(2,5);
          System.out.println(sc);

          //append means adding element at the end
          sc.append('y');
          System.out.println(sc);





    }
    
}
