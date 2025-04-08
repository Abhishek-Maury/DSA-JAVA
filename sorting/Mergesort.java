import java.util.Arrays;

public class Mergesort {
   public static void main(String[] args) {
    int[] arr = {5,4,3,2,1};
    // arr=mergesort(arr);
   mergesortInplace(arr, 0, arr.length);
    System.out.println(Arrays.toString(arr));
   } 

   static int[] mergesort(int[] arr){
    if (arr.length==1) {
        return arr;
    }
    int mid =arr.length/2;
    int[] left = mergesort(Arrays.copyOfRange(arr, 0,mid ));
    int[] right = mergesort(Arrays.copyOfRange(arr, mid,arr.length ));

    return merge(left,right);
   }

   static int[] merge(int[] first,int[] secound){
    int [] mix = new int[first.length+secound.length];
    int i=0;
    int j=0;
    int k=0;
    while (i<first.length&&j<secound.length) {
        if (first[i]<secound[j]) {
            mix[k]=first[i];
            i++;
        }
        else{
            mix[k]=secound[j];
            j++;
        }
        k++;
    }

    // it may be possible that one of array is not complete
    // copy the remaining elements
    while (i<first.length) {
        mix[k]=first[i];
        i++;
        k++;
    }
    while (j<secound.length) {
        mix[k]=secound[j];
        j++;
        k++;
    }
    return mix;
   }

   //    Inplace merge sort
   
   static void mergesortInplace(int[] arr,int s,int e){
    if ((e-s)==1) {
        return ;
    }
    int mid =(s+e)/2;
    mergesortInplace(arr, s,mid );
    mergesortInplace(arr, mid,e );

     mergeInplace(arr,s,mid,e);
   }

   static void mergeInplace(int[] arr,int s,int m, int e){
    int [] mix = new int[e-s];
    int i=s;
    int j=m;
    int k=0;
    while (i<m&&j<e) {
        if (arr[i]<arr[j]) {
            mix[k]=arr[i];
            i++;
        }
        else{
            mix[k]=arr[j];
            j++;
        }
        k++;
    }

    // it may be possible that one of array is not complete
    // copy the remaining elements
    while (i<m) {
        mix[k]=arr[i];
        i++;
        k++;
    }
    while (j<e) {
        mix[k]=arr[j];
        j++;
        k++;
    }

    for (int l = 0; l < mix.length; l++) {
        arr[s+l]=mix[l];
    }
   
   }


   
}
