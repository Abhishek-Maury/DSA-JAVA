public class CyclicQ3 {
   public static void main(String[] args) {
    int [] nums = {1,3,4,2,2}; 
    System.out.println(findDuplicate(nums));
   } 


 int findDuplicate(int[] nums){
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
            return nums[j];

        }
    }
    return 0;

   }

   static void swap(int[]arr,int first,int secound){
    int temp=arr[first];
    arr[first]=arr[secound];
    arr[secound]=temp;
}



}
