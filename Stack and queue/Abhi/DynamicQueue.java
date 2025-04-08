package Abhi;

public class DynamicQueue extends CircularQueue {
    DynamicQueue(){
        super();
    }
    DynamicQueue (int size){
        super(size);
    }
    @Override
    public boolean insert(int item){
        if (this.isfull()) {
            ///double the array size
            int[] temp = new int[data.length*2];

            //copy all the previous items in the new array
            for (int i = 0; i <data.length; i++) {
                temp[i]=data[(front+i)%data.length];
            }
            front=0;
            end=data.length;
            data = temp;
        }
        // at this point we know that array is not full
        // insert them
        return super.insert(item);
    }

}
