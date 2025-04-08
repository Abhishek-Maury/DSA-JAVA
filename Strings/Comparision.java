public class Comparision {
    public static void main(String[] args) {
        
        // String a= "abhishek";
        // String b= "abhishek";
        // System.out.println(a==b);

// Creating different objects

          String a = new String("Kunal");
          String b = new String("Kunal");
          System.out.println(a==b);
// Giving False because they are outside the pool but in the heap memory. 

          System.out.println(a.equals(b));
// .equals to check the values
          System.out.println(a.charAt(0));
    }
}
