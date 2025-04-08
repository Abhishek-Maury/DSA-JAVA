import java.util.HashMap;

public class ItineraryTickets {

    public static String getStart(HashMap<String,String> map){
        HashMap<String,String> Revmap = new HashMap<>();
         
        for (String key : map.keySet()) {
            Revmap.put(map.get(key), key); 
        }
        for (String key : map.keySet()) {
           if (!Revmap.containsKey(key)) {
              return key;
           }
        }
        return null;
    
    }
    public static void main(String[] args) {          //O(n)
        HashMap<String,String> map = new HashMap<>();
        map.put("Chennai", "bengaluru");
        map.put("Mumbai", "Delhi");
        map.put("Goa", "Chennai");
        map.put("Delhi", "Goa");

        String start=getStart(map);
        System.out.print(start);
        for (String key : map.keySet()) {
            System.out.print(" -> "+map.get(start));
            start = map.get(start);
        }
        System.out.println();

    }
}
