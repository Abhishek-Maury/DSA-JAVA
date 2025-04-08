public class FindminNum {
    public static void main(String[] args) {
        int arr []= {23,43,32,65,3,1,24};
        System.out.println(min(arr));
    }

    static int min(int arr[]){
        int ans = arr[0];
        for (int i =1 ; i < arr.length; i++) {
         if (arr[i]<ans) {
            ans=arr[i];
         }

        }
        return ans;
    }
}
