package packages.properties.Polymorphism;

public class Number {
     double sum(double a,int b){
        return a+b;
     }
     int sum(int a,int b,int c){
        return a+b+c;
     }
     public static void main(String[] args) {
        Number obj = new Number();
        obj.sum(2, 3);

     }
}

