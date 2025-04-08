public class CellingOfANum {
    public static void main(String[] args) {
      
        int[]arr={1,12,13,15,17,18,19};
        int target=16;
        int ans = Search(arr, target);
        System.out.println(ans);


    }

    static int Search(int[]arr,int target){
     int start =0;
     int end = arr.length -1;
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
    //here when the while loop is breaks because the element not found then
    //  End Start And return the Start value  
return arr[start];
}
}
