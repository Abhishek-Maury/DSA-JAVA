import java.util.*;
public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
        lhm.put("India", 150);
        lhm.put("China", 100);
        lhm.put("US", 50);
        System.out.println(lhm);

        TreeMap<String,Integer> tm =new TreeMap<>();
        tm.put("India", 150);
        tm.put("China", 100);
        tm.put("US", 50);
        System.out.println(tm);
        
    }
}
