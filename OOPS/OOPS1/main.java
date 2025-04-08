public class main {

    public static void main(String[] args) {
        Student student1=new Student();
        
        // student1.rol=34;
        // student1.name="Kunal kushwaha";
        // student1.marks=34.5f;
        
        // System.out.println(student1.marks);
        // System.out.println(student1.name);  
        student1.greeting();

    Student arpit =new Student(34,"Abhishek maurya",45.5f);
    // System.out.println(arpit.marks);
    // System.out.println(arpit.name);
    // System.out.println(arpit.rno);

    Student random = new Student();
    System.out.println(random.name);
    }

   
}
// Create a class
class Student{
    int rno;
    String name;
    float marks=90;
   
    

    void changeName(String name){
        this.name=name;
    }
    void greeting(){
        System.out.println("My name is " + name);
    }
   

    // When a Constructor call the another Constructor
    Student(){
        // Initially: new Student(34,"Default name",100f);
        this(34,"Default name",100f);
      }

    Student(int rno,String name,float marks ){
        this.rno =rno;
        this.name=name;
        this.marks=marks;
       
     
    }
}
