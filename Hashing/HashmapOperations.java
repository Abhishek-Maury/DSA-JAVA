import java.util.HashMap;
import java.util.Set;

public class HashmapOperations {

    public static void main(String[] args) {
        //create 
        HashMap<String,Integer> hm=new HashMap<>();

        //put
        hm.put("India", 150);
        hm.put("China", 180);
        hm.put("Nepal", 250);
        
        //Iterate
        Set <String> keys = hm.keySet();
        System.out.println(keys);
        for (String k : keys) {
            System.out.println(" key= "+k+", "+" value= "+hm.get(k));
        }

        // //get
        // System.out.println(hm.get("India"));

        // //containsKey
        // hm.containsKey("China");

        // //remove
        // System.out.println(hm.remove("China"));
        // System.out.println(hm);

        // //size
        // System.out.println(hm.size());

        // //clear
        // hm.clear();

        // //isEmpty
        // System.out.println(hm.isEmpty());
        

    }
}