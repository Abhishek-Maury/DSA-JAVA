public class RBS {
    // roted sorted array
    public static void main(String[] args) {
        int []nums ={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(RSA(nums, target));
    }


    static int RSA(int[]nums,int target){
  int pivot = FindPivot(nums);
//   if pivot element not found then it is not a sorted array so apply normal binary search
 if (pivot==-1) {
    return Search(nums, target,0,nums.length-1);
 }
 if (nums[pivot]==target) {
    return pivot;
 }
 if (target>=nums[0]) {
    return Search(nums, target, 0, pivot-1);
 }
 return Search(nums, target, pivot+1, nums.length-1);

    }

// binary search

    static int Search(int[]arr,int target,int start,int end){
        
        while (start<=end) {
           int mid =start+(end-start)/2;
           if (target>arr[mid]) {
              start = mid + 1;
           } 
           else if (target<arr[mid]){
              end=mid -1;
           }
           else{
      
           return mid;  
           }
        } 
        
   return -1;
   
       }

// find pivot element

    static int FindPivot(int[]arr){
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid =start+(end-start)/2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return  mid-1;
            }
            if (arr[start]>arr[mid]) {
                return end =mid-1;
            }
            else{
                return start=mid+1;
            }
        }
        return-1;
    }
}
