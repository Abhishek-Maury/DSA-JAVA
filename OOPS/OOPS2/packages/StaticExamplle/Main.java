package packages.StaticExamplle;

public class Main {
    public static void main(String[] args) {
        
    Human kunal = new Human(22, "kunal",100000, false);
    Human rahul = new Human(22, "rahul",150000, false);
    Human mohit = new Human(22, "mohit",150000, false);

//    System.out.println(Human.population);
//    System.out.println(Human.population);
//    System.out.println(Human.population);


    }
// this is not dependent an objects
    static void fun(){
    //    greeting(); //you cant use this because it requires an instance
        //but the function you are using it in does not depend on instance
        //you cannot acess non static stuff without referencing their instances in a static context
        Main obj= new Main();
        obj.greeting();
    }
    // we know that something which is not static,belongs to an object
    void greeting(){
        System.out.println("hello world");
    }
}
