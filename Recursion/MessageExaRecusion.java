public class MessageExaRecusion {
    public static void main(String[] args) {
        // Recursion
        Print(1);   
    }
    static void Print (int n){
    //  Base condition
       if (n==5) {
        System.out.println(5);
        return;
       }
        System.out.println(n);
        Print(n+1);
    }
}
