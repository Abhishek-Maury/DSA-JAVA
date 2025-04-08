package packages.properties.Inheritance;

public class BoxWeight extends Box {
    double weight;
    double side;
     
    BoxWeight(){
        this.weight=-1;
    }
    public BoxWeight(double weight) {
        this.weight = weight;
    }

    BoxWeight (BoxWeight other) {
        super(other);
        weight = other.weight;
    }

    public BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
        
    }

    public BoxWeight(int l, int h, int w, double weight) {
        super(l, h, w); // call the parent class constuctor
        //used to intilize values present in parent class
        this.weight = weight;
        // System.out.println(super.weight);
    }
    
}
