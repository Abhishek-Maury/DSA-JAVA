import java.util.*;
public class ActivityAelectionAlgo {

    public static void main(String[] args) {
        int[] start ={1,3,0,5,8,5};
        int [] end = {2,4,6,7,9,9};

        //if end was not sorting
    //sorting
    int[][] activities = new int[start.length][3];
    for (int i = 0; i < start.length; i++) {
        activities[i][0]=i;
        activities[i][1]=start[i];
        activities[i][2]=end[i];
    }

    Arrays.sort(activities,Comparator.comparingDouble(o ->o[2]));


     ArrayList<Integer> ar = new ArrayList<>();
     int maxAct=0;

     //ist activity
     ar.add(activities[0][0]);
     maxAct=1;
     int lastEnd=activities[0][2];
     for (int i = 1; i < end.length; i++) {
        if (activities[i][1]>=lastEnd) {
            ar.add(activities[i][0]);
            maxAct++;
            lastEnd=activities[i][2];          
        }
     }

     System.out.println("MaxAct = "+maxAct);
     for (int i = 0; i < ar.size(); i++) {
        System.out.println("A"+ar.get(i));
     }

    }
}