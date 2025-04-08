public class FirstAndLastPos {
   public static void main(String[] args) {
    int[] nums ={2,3,7,7,7,7,8,8,9};
    int target = 7;
    int[] sol = searchRange(nums,target);
    System.out.println(sol);

   }
   public static int[] searchRange(int[] nums, int target) {

// check for first occurance target

  
    int[] ans = {-1,-1};
    ans[0]=search(nums, target, true);
    if (ans[0]!=-1) {
      ans[1] = search(nums, target, false);
    }
    
   
    return ans;
   }
//    this function just returns the index value of target
    static int search(int[]nums,int target,boolean findStartIndex){

        int start =0;
        int end = nums.length -1;
        int ans = -1;
        while (start<=end) {
           int mid =start+(end-start)/2;
           if (target>nums[mid]) {
              start = mid + 1;
           } 
           else if (target<nums[mid]){
              end=mid -1;
           }
           else{
        //  potential ans found
           ans=mid; 
           if (findStartIndex) {
            end =mid-1;
           } 
           else{
            start =mid+1;
           }
           }
        }
        return ans;
    }
     
   
}
