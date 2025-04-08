package Abhi;

public class DynamicStack extends CustomStack {
    DynamicStack (){
        super();
    }
    DynamicStack (int size){
        super(size);
    }
     @Override
    public boolean push(int item){
        if (this.isfull()) {
            ///double the array size
            int[] temp = new int[data.length*2];

            //copy all the previous items in the new array
            for (int i = 0; i <data.length; i++) {
                temp[i]=data[i];
            }
            data = temp;
        }
        // at this point we know that array is not full
        // insert them
        return super.push(item);
    }

}
