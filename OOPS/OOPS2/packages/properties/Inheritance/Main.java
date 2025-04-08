package packages.properties.Inheritance;

public class Main {
    public static void main(String[] args) {
        // Box box1 =new Box();
        // System.out.println(box1.l);
        // BoxWeight box2 = new BoxWeight(2,4,5,8);
        // System.out.println(box2.l+" "+ box2.weight);

    //     Box box3 = new BoxWeight(3, 4, 5, 6);
    //     System.out.println(box3.h);
        
    //     Box box5 = new BoxWeight(2, 3, 4, 8);
    //    System.out.println(box5.w);

        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // this is why error
    //    BoxWeight box6 = new Box(2, 3, 4);
    //    System.out.println(box6);


    BoxPrice box = new BoxPrice(5,8,200);
    }
}
