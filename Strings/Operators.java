import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');

        System.out.println("a"+"b");

        System.out.println("a"+1);

        System.out.println("kunal"+new ArrayList<>());
        
// Two complex objects are not add but if there are at least one string is there so it will done.
// "+" operator want at least one string to add
        System.out.println(new Integer(56)+""+new ArrayList<>());
    }
}
        