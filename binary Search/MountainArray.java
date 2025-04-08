public class MountainArray {
    public static void main(String[] args) {
        
    }
    int search(int[]arr,int target){
    int peak=PeakIndexInMountainArray(arr);
    int firstTry=Searchses(arr, target,arr[0],peak);
    if (firstTry!=-1) {
        return firstTry;
    }
    //try to search in secound half
    return Searchses(arr, target,peak+1,arr.length-1);
    }
    static int PeakIndexInMountainArray(int[]arr){
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



    static int Searchses(int[]arr,int target,int start,int end){

   
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
