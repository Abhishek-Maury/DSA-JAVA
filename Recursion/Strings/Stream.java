public class Stream {

    public static void main(String[] args) {
        // Skip("", "baccad");
        System.out.println(Skip2("baccad"));
        System.out.println(SkipAppNotApple("bapplccad"));
    }

static void Skip(String p, String up){
    if (up.isEmpty()) {
        System.out.println(p);
        return;
    }
    char ch = up.charAt(0);
    if (ch=='a') {
        Skip(p, up.substring(1));
    }
    else{
        Skip(p+ch, up.substring(1));
    }
    
}

static String Skip2( String up){
    if (up.isEmpty()) {
        return "";
    }
    char ch = up.charAt(0);
    if (ch=='a') {
       return Skip2(up.substring(1));
    }
    else{
        return ch+ Skip2(up.substring(1));
    }
    
}
 // Skip startwith apple
static String SkipApple( String up){
    if (up.isEmpty()) {
        return "";
    }
    if (up.startsWith("apple")) {
       return SkipApple(up.substring(5));
    }
    else{
        return up.charAt(0)+ SkipApple(up.substring(1));
    }
    
}

// Skip app but not apple
static String SkipAppNotApple( String up){
    if (up.isEmpty()) {
        return "";
    }
    if (up.startsWith("app")&& !up.startsWith("apple")) {
       return SkipAppNotApple(up.substring(3));
    }
    else{
        return up.charAt(0)+ SkipAppNotApple(up.substring(1));
    }
    
}
}