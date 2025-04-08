import java.util.Arrays;

public class Selection {
public static void main(String[] args) {
    int [] arr = {5,4,3,2,1};
    Selec(arr);
    System.out.println(Arrays.toString(arr));
      
}
static void Selec(int[]arr){
    
    for (int i = 0; i < arr.length; i++) {
        // first find the maximum number
        int last = arr.length-i-1;
        int maxIndex=getMax(arr,0,last);
        swap(arr,maxIndex,last);

    }
}
static void swap (int[]arr,int first,int secound){
    int temp=arr[first];
     arr[first]=arr[secound];
     arr[secound]=temp;

}
static int getMax(int[]arr,int start,int end){
    int max = start;
    for (int i = start; i <=end; i++) {
         if (arr[max]<arr[i]) {
            max=i;
         }
    }
    return max;
}
    
}