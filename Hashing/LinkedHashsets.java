import java.util.*;

public class LinkedHashsets {
    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("India");
        cities.add("China");
        cities.add("Indonesia");
        cities.add("US");

        System.out.println(cities);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("India");
        ts.add("China");
        ts.add("Indonesia");
        ts.add("US");

        System.out.println(ts);

    }
}
