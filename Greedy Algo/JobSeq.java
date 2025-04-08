import java.util.*;
public class JobSeq {
   static class job{
    int deadline;
    int profit;
    int id;
    public job(int deadline, int profit, int id) {
        this.deadline = deadline;
        this.profit = profit;
        this.id = id;
    }
    
    }

    public static void main(String[] args) {
        int[][] jobsinfo={{4,20},{1,10},{1,40},{1,30}};
        ArrayList<job> jobs =new ArrayList<>();

        for (int i = 0; i < jobsinfo.length; i++) {
            jobs.add(new job(jobsinfo[i][0], jobsinfo[i][1], i));
        }

        Collections.sort(jobs,(obj1,obj2) -> obj2.profit-obj1.profit); //decending order sorting

        ArrayList<Integer> jobSec =new ArrayList<>();
        int time=0;
        for (int i = 0; i < jobs.size(); i++) {
            job curr = jobs.get(i);
            if (curr.deadline>time) {
                jobSec.add(curr.id);
                time++;
            }
        }

        //print seq
    System.out.println("max jobs = "+jobSec.size());
    for (int i = 0; i < jobSec.size(); i++) {
        System.out.print(jobSec.get(i)+" ");
    }

    System.out.println();

    }
}
