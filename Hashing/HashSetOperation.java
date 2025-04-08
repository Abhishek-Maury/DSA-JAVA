import java.util.*;
public class HashSetOperation {
    public static void main(String[] args) {
        // HashSet<Integer> set = new HashSet<>();
        // set.add(2);
        // set.add(6);
        // set.add(5);
        // set.add(1);
        // set.add(2);

    //     System.out.println(set);
    //    set.remove(2);
    //     if (set.contains(2)) {
    //         System.out.println("Contains 2");
    //     }
    //     System.out.println(set.size());
    //     set.clear();
    //     System.out.println(set.isEmpty());

    

    HashSet<String> hs = new HashSet<>();
    hs.add("India");
    hs.add("China");
    hs.add("Indonesia");
    hs.add("US");

    // Iteration on hashset

    // Iterator it = hs.iterator();
    // while (it.hasNext()) {
    //     System.out.println(it.next());
    // }

    for (String str : hs) {
        System.out.println(str);
    }

    }
}
