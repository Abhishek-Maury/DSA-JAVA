public class CyclicQ5 {
    // https://leetcode.com/problems/set-mismatch/
    public static void main(String[] args) {
        
    }


    public int[] findErrorNums(int[] nums) {
    
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
    for (int j = 0; j < nums.length; j++) {
        if (nums[j]!=j+1) {
            return new int [] {nums[j],j+1};

        }
    }
    return new int[] {-1,-1};

   }

   static void swap(int[]arr,int first,int secound){
    int temp=arr[first];
    arr[first]=arr[secound];
    arr[secound]=temp;
}

    }

