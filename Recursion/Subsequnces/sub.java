import java.util.ArrayList;

public class sub {
public static void main(String[] args) {
    // subSequAscii("", "abc");
   System.out.println( subseqRetAscii("", "abc"));
}

static void subSequ(String p,String up){
    if (up.isEmpty()) {
        System.out.println(p);
        return;
    }

    char ch =up.charAt(0);
    subSequ(p+ch, up.substring(1));
    subSequ(p, up.substring(1));
}

// Arraylist

static ArrayList<String> subseqRet(String p,String up){
    if (up.isEmpty()) {
        ArrayList<String> list =new ArrayList<>();
        list.add(p);
        return list;
    }

    char ch =up.charAt(0);
    ArrayList<String> left=  subseqRet(p+ch, up.substring(1));
    ArrayList<String> right=subseqRet(p, up.substring(1));

    left.addAll(right);
    return left;
}

static void subSequAscii(String p,String up){
    if (up.isEmpty()) {
        System.out.println(p);
        return;
    }

    char ch =up.charAt(0);
    subSequAscii(p+ch, up.substring(1));
    subSequAscii(p, up.substring(1));
    subSequAscii(p+(ch+0), up.substring(1));
}

static ArrayList<String> subseqRetAscii(String p,String up){
    if (up.isEmpty()) {
        ArrayList<String> list =new ArrayList<>();
        list.add(p);
        return list;
    }

    char ch =up.charAt(0);
    ArrayList<String> first=  subseqRetAscii(p+ch, up.substring(1));
    ArrayList<String> secound=subseqRetAscii(p, up.substring(1));
    ArrayList<String> third=subseqRetAscii(p+(ch+0), up.substring(1));

    first.addAll(secound);
    first.addAll(third);
    return first;
}


    
}