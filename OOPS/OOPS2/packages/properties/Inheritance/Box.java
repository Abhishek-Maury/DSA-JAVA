package packages.properties.Inheritance;

public class Box {
    private double l;
    double h;
    double w;
    // double weight;

    public Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }
    public Box(int l, int h, int w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }
    Box(Box old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }
    Box (double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }
    
    
}
