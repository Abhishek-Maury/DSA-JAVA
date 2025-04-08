import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Asked in Google
public class CyclicQ2 {
    public static void main(String[] args) {
       int[] arr ={4,3,2,7,8,2,3,1};
       

    }
   public List<Integer> findDisappearedNumbers(int[] nums){
        int i=0;
        while (i<nums.length) {
            int correct = nums[i]-1;
            if (nums[i]!=nums[correct]) {
                swap(nums,i,correct);
            } 
            else{
                i++;
            }
        }
        // just find missing number

        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j]!=j+1) {
               ans.add(j+1);
     }
        }
        return ans;
        
     }
    
  static void swap(int[]arr,int first,int secound){
        int temp=arr[first];
        arr[first]=arr[secound];
        arr[secound]=temp;
    }
    
}
