import java.util.ArrayList;

public class maze {

    public static void main(String[] args) {
        // System.out.println(mazeRet("", 3, 3));
        // mazePrint("", 3, 3);   
        // System.out.println(mazeRetDigonal("", 3,   3));
        boolean[][] board ={
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };
         mazeRestrictions("", board, 0,0 );
    }
    // count 
static int count (int r,int c){
    if (r==1||c==1){
       return 1;
    }
        int left = count(r-1, c);  
        int right = count(r, c-1);
        return left+right;
} 
// All path
static void mazePrint(String p, int r,int c){
    if (r==1&&c==1) {
        System.out.println(p);
        return;
    }
    if (r>1) {
       mazePrint(p + 'D', r-1, c);
    }
    if (c>1) {
        mazePrint(p+'R', r, c-1);
    }
}

// Arraylist
static ArrayList<String> mazeRet(String p, int r,int c){
    if (r==1||c==1) {
        ArrayList<String> list=new ArrayList<>();
        list.add(p);
        return list;       
    }
    ArrayList<String> list=new ArrayList<>();
    if (r>1) {
       list.addAll( mazeRet(p + 'D', r-1, c));
     }
     if (c>1) {
        list.addAll( mazeRet(p+'R', r, c-1));
     }
     return list;
 
}

static ArrayList<String> mazeRetDigonal(String p, int r,int c){
    if (r==1&&c==1) {
        ArrayList<String> list=new ArrayList<>();
        list.add(p);
        return list;       
    }
    ArrayList<String> list=new ArrayList<>();
    if (r>1&&c>1) {
        list.addAll(mazeRetDigonal(p + 'D', r-1, c-1));
    }
    if (r>1) {
       list.addAll(mazeRetDigonal(p + 'V', r-1, c));
     }
     if (c>1) {
        list.addAll( mazeRetDigonal(p+'H', r, c-1));
     }
     return list;
 
}

static void mazeRestrictions(String p,boolean[][] maze, int r,int c){
    if (r==maze.length-1 &&c==maze[0].length-1) {
        System.out.println(p);
        return;
    }
    if (!maze[r][c]) {
        return;
    }
    if (r<maze.length-1) {
        mazeRestrictions(p + 'D',maze, r+1, c);
    }
    if (c<maze[0].length-1) {
        mazeRestrictions(p+'R',maze, r, c+1);
    }
}

}