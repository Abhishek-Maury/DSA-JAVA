public class CyclicQ6 {
    // https://leetcode.com/problems/first-missing-positive/
    public static void main(String[] args) {
        
    }


    public int firstMissingPositive(int[] arr) {
        int i=0;
        while (i<arr.length) {
            int correct = arr[i];
            if (arr[i]>0 && arr[i]<=arr.length && arr[i]!=arr[correct]) {
                swap(arr,i,correct);
            }
            else{
                i++;
            }

            // search
            
        }
        for (int index = 0; index < arr.length; index++) {
                if (arr[index]!=index+1) {
                    return index+1;
                }
                
        }
        return arr.length+1;
    }
    static void swap(int[]arr,int first,int secound){
        int temp=arr[first];
        arr[first]=arr[secound];
        arr[secound]=temp;
    }
}
