
import java.util.Arrays;

public class SearchIn2dArray {
    
    public static void main(String[] args) {
        int [][] arr={
            {12,32,43,33},
            {23,31,76},
            {22,32,11,101}
                  };
        int target = 11;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
}

// function of finding min number
static int[] search(int[][] arr,int target){
    for (int row = 0; row < arr.length; row++) {
        for (int col = 0; col < arr[row].length; col++) {
            if (arr[row][col]==target) {
                return new int[]{row,col};
            }
        }
    }
    
return new int[] {-1,-1};   
}
//  funtion of finding the max number
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]>max) {
                   max=arr[row][col];
                }
            }
        }
        return max;
    }
}
