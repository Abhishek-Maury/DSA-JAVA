import java.util.ArrayList;
import java.util.List;

public class CyclicQ4 {
 public static void main(String[] args) {
   
 }  
 
 public List<Integer> findAllDuplicate(int[] nums){
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
           ans.add(nums[j]);
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
