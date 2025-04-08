public class EvenDigits {
   public static void main(String[] args) {
    // Given an array nums of integer ,return how many of them contain an Even number of digit.
    // int[] nums ={23,4334,234,11332};
    // System.out.println(findNumber(nums));
    System.out.println(counting2(634536536));
   } 
//  Main function create
   static int findNumber(int[]nums){
  int count =0;
  for (int num : nums) {
    if (even(num)){
count++;
    } 
  }
  
  return count;
    
}
// Check that digits are even or not fun

   static boolean even(int num){
    int numOfDigits =counting(num);
   return numOfDigits %2==0;
   }

static int counting2(int num){
    if (num<0) {
        num=num*-1;
    }

    return (int)(Math.log10(num)) +1 ;
}

// Count the Digits fun
   static int counting(int num){
    if (num<0) {
        num=num*-1;
    }
    if (num==0) {
        return 1;
    }
    int count =0;
    while (num>0) {
        count++;
        num=num / 10; 
    }
    return count;

   
   }
}
