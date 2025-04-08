import java.util.ArrayList;
public class LinearSearch {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,4,8};
      
        // System.out.println(linear(arr, target, 0));
        // ArrayList<Integer> ans=findAllIndex(arr, 4, 0, new ArrayList<>());
        // System.out.println(ans);

        System.out.println(findAllIndex2(arr, 4, 0));

    }

    static int linear(int[] arr,int target,int index){
    if (index==arr.length) {
        return -1;
    }
     if (arr[index]==target ) {
        return index;
     }
     return linear(arr, target, index+1);
    }

// Arraylist
static ArrayList<Integer> findAllIndex(int[] arr,int target,int index, ArrayList<Integer> list){
    if (index==arr.length) {
        return list;
    }
     if (arr[index]==target ) {
        list.add(index);
     }
     return findAllIndex(arr, target, index+1,list);
    }

    static ArrayList<Integer> findAllIndex2(int[] arr,int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (index==arr.length) {
            return list;
        }
         if (arr[index]==target ) {
            list.add(index);
         }
         ArrayList<Integer> ansFromBelowCalls= findAllIndex2(arr, target, index+1);
         list.addAll(ansFromBelowCalls);
         return list;
        }
}
