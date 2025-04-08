public class PeakIndexOfArray {
    public static void main(String[] args) {
        // https://leetcode.com/problems/find-peak-element
        int[]arr={0,1,3,5,7,9,8,6,4,2};
        System.out.println(Peak(arr));
    }
    static int Peak(int[]arr){
        int start =0;
        int end = arr.length -1;
        while (start<end) {
           int mid =start+(end-start)/2;
           if (arr[mid]>arr[mid+1]) {
               end=mid;
           } 
           else {
            start = mid+1;  //arr[mid]<arr[mid+1]
           }          
        }         
   return start; //return start and end both conditions
    }
}
