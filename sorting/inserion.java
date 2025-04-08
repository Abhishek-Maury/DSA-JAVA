import java.util.Arrays;

public class inserion {
    public static void main(String[] args) {
        int[] arr={5,3,4,1,2};
        inser(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void inser(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if (arr[j]<arr[j-1]) {
                    swap(arr, j, j-1);
                } 
                else{
                    break;
                }
            }
        }
    }
    static void swap (int[]arr,int first,int secound){
        int temp=arr[first];
         arr[first]=arr[secound];
         arr[secound]=temp;
    
    }
}
