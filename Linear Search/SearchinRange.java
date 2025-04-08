public class SearchinRange {
    public static void main(String[] args) {
        

        int[] nums ={23,43,19,776,44,35};
        int target = 44;
        int ans = linearSearch(nums, target,1,4);
        System.out.println(ans);
    }

  static int linearSearch(int[] arr,int target,int start,int end){
    if (arr.length==0) {
        return -1;
    }
    for (int i = start; i < end; i++) {
        int element = arr[i];
        if (element==target) {
            return i;
        }
    }
    return -1;
}
}
