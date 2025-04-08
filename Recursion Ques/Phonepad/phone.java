import java.util.ArrayList;

public class phone {

    public static void main(String[] args) {
        System.out.println(combinationRet("", "12"));
    }

 static void combination(String p,String up){
    if (up.isEmpty()) {
        System.out.println(p);
        return;
    }
    int digit =up.charAt(0)-'0'; //This will convert '2' to 2


    for (int i = (digit-1)*3; i < digit*3; i++) {
        char ch = (char) ('a'+i);

        combination(p+ch, up.substring(1));
    }
 }


 static ArrayList<String> combinationRet(String p,String up){
    if (up.isEmpty()) {
        ArrayList<String> list= new ArrayList<>();
        list.add(p);
        return list;
    }
    int digit =up.charAt(0)-'0'; //This will convert '2' to 2

    ArrayList<String> list = new ArrayList<>();
    for (int i = (digit-1)*3; i < digit*3; i++) {
        char ch = (char) ('a'+i);        

        list.addAll(combinationRet(p+ch, up.substring(1)));
    }
    return list;
 }
}