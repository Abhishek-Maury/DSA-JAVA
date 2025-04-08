public class NTo1 {
    public static void main(String[] args) {
        Both(5);
    }
    static void Print (int n){
        if (n==0) {
            return;
        }
        System.out.println(n);
        Print(n-1);  
    }

    static void Both (int n){
        if (n==0) {
            return;
        }
        System.out.println(n);
        Both(n-1); 
        System.out.println(n); 
    }
}
