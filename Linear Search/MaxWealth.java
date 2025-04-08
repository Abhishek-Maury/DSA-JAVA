public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr ={
            {1,2,3},
            {4,5,6},
            {6,5,1}
        };
        System.out.println(Wealth(arr));
    }
        
    static int Wealth(int arr[][]){
       int ans = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            int sum =0;
            for (int col = 0; col < arr[row].length; col++) {
                sum+=arr[row][col];
            }
            if (sum>ans) {
                ans=sum;
            }
        }
        return ans;
    
    }

}
