public class orderAgnosticBS {
    public static void main(String[] args) {
        int[]arr={1,12,13,15,17,18,19};
        // int []arr={80,75,70,60,50,47,18,15,13,11};
        int target=18;
        int ans = Searchses(arr, target);
        System.out.println(ans);


    }

    static int Searchses(int[]arr,int target){
     int start =0;
     int end = arr.length -1;

    // check it is ascending order or decending order

    boolean isAsc = arr[start]<arr[end];

     while (start<=end) {
        int mid =start+(end-start)/2;
//   common condition for both
        if (arr[mid]==target) {
            return mid;
        }
// for Accending order
    if (isAsc) {
        if (target>arr[mid]) {
            start = mid + 1;
         } 
         else{
            end=mid -1;
         }
    }
    // for decending....
    else{
        if (target<arr[mid]) {
            start = mid + 1;
         } 
         else{
            end=mid -1;
         }
    }
      
        
     } 
     
return -1;

    }
}
