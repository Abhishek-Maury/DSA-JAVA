import java.util.Stack;

public class MaxAreaInHistogram {

    public static int max(int[] height){
        int[] nls=new int[height.length]; //next left smaller
        int[] nrs=new int[height.length]; //next right smaller
        Stack<Integer> s=new Stack<>();
        //next left smaller
        for (int i = 0; i < height.length; i++) {
            while (!s.empty() && height[s.peek()]>=height[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nls[i]=-1;
            }else{
                nls[i]=s.peek();
            }
            s.push(i);
            
        }
        s=new Stack<>();
         //next right smaller
         for (int i = height.length-1; i >=0; i--) {
            while (!s.empty() && height[s.peek()]>=height[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nrs[i]=height.length;
            }else{
                nrs[i]=s.peek();
            }
            s.push(i);
         }
         int max=Integer.MIN_VALUE;
         for (int i = 0; i < height.length; i++) {
            int area=height[i]*(nrs[i]-nls[i]-1);
            max=Math.max(max,area );
         }
         return max;
    }
    public static void main(String[] args) {
        int[] arr={2,1,6,5,2,3};
        System.out.println(max(arr));
    }
}
