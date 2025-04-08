import java.util.*;

public class CheapestFlightskStops {

    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    static class Info {
        int v;
        int cost;
        int stops;

        public Info(int v, int cost, int s) {
            this.v = v;
            this.cost = cost;
            this.stops = s;
        }

    }

    public static void creatgraph(int[][] flights, ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < flights.length; i++) {
            int src = flights[i][0];
            int dest = flights[i][1];
            int wt = flights[i][2];

            Edge e = new Edge(src, dest, wt);
            graph[src].add(e);

        }

    }

    public static int cheapestFlight(int n, int[][] flights, int src, int dest, int k) {
        ArrayList<Edge>[] graph = new ArrayList[n];
        creatgraph(flights, graph);

        int[] dista = new int[n];
        for (int i = 0; i < dista.length; i++) {
            if (i!=src) {
                dista[i]=Integer.MAX_VALUE;
            }
        }

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(0, 0, 0));

        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr.stops>k ) {
                break;
            }
            for (int i = 0; i < graph[curr.v].size(); i++) {
                Edge e = graph[curr.v].get(i);
                int u = e.src;
                int v= e.dest;
                int wt = e.wt;
                if ( curr.cost+wt<dista[v] && curr.stops<=k) {
                    dista[v]=curr.cost+wt;
                    q.add(new Info(v,dista[v],curr.stops+1));
                }
            }
        }
        // dista [dest]
        if (dista[dest]==Integer.MAX_VALUE) {
            return -1;
        }else{
            return dista[dest];
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] flights = { { 0, 1, 100 }, { 1, 2, 100 }, { 2, 0, 100 }, { 1, 3, 600 }, { 2, 3, 200 } };
        int src = 0, dst = 3, k = 1;
        cheapestFlight(n, flights, src, dst, k); 
        System.out.println(cheapestFlight(n, flights, src, dst, k));

    }
}
