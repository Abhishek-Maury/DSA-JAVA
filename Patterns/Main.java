public class Main {
 public static void main(String[] args) {
    Pattern28(5);
   
 }
 static void Pattern1 (int n){
    for (int row = 1; row <=n; row++) {
         // for every row run  the col
        for (int col = 1; col <=n; col++) {
            System.out.print("* ");
        }
        System.out.println();
    }
 }
 static void Pattern2 (int n){
    for (int row = 1; row <=n; row++) {
        // for every row run  the col
        for (int col = 1; col <=row; col++) {
            System.out.print("* ");
        }
        System.out.println();
    }
 }
 static void Pattern3 (int n){
    for (int row = 1; row <=n; row++) {
        // for every row run  the col
        for (int col = 1; col <=n-row+1; col++) {
            System.out.print("* ");
        }
        System.out.println();
    }
 }
 static void Pattern4 (int n){
    for (int row = 1; row <=n; row++) {
         // for every row run  the col
        for (int col = 1; col <=row; col++) {
            System.out.print(col+" ");
        }
        System.out.println();
    }
 }
 static void Pattern5 (int n){
    for (int row = 1; row <=n; row++) {
         // for every row run  the col
        for (int col = 1; col <=n; col++) {
            System.out.print("* ");
        }
        System.out.println();
    }
 }
 static void Pattern6 (int n){
    for (int row = 0; row <=2*n; row++) {
         // for every row run  the col
         int totalColInRow=row>n ? 2*n-row :row;
        for (int col = 0; col <totalColInRow;col++) {
            System.out.print("* ");
        }
        System.out.println();
    }
 }
 static void Pattern28 (int n){
    for (int row = 0; row <=2*n; row++) {
         // for every row run  the col
         int totalColInRow=row>n ? 2*n-row :row;
         int noOfSpaces = n-totalColInRow;
         for (int s = 0; s <noOfSpaces; s++) {
            System.out.print(" ");
         }
        for (int col = 0; col <totalColInRow;col++) {
            System.out.print("* ");
        }
        System.out.println();
    }
 } 
 static void Pattern30 (int n){
    for (int row = 1; row <=n; row++) {
        // for every row run  the col
        for (int col = 1; col <=row; col++) {
            System.out.print("* ");
        }
        System.out.println();
    }
 }
}