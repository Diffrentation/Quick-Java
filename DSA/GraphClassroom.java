import java.util.ArrayList;

public class GraphClassroom {
    public static class Edge {  // Edge should be static to be accessible in static main
        int src;
        int dest;
        int wt;
        Edge(int s, int d, int wt) {
            this.src = s;
            this.dest = d;
            this.wt=wt;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 2, 5));
        graph[1].add(new Edge(1, 2, 6));
        graph[1].add(new Edge(1, 3, 7));
        graph[2].add(new Edge(2, 0, 8));
        graph[2].add(new Edge(2, 1, 9));
        graph[2].add(new Edge(2, 3, 10));
        graph[3].add(new Edge(3, 1, 11));
        graph[3].add(new Edge(3, 2, 12));
    }
    
    public static void main(String[] args) {
        int vertex = 4;
        ArrayList<Edge>[] graph = new ArrayList[vertex];  // Declare and initialize graph
        createGraph(graph);  // Call createGraph with graph

        // Printing the neighbors of vertex 0
        for (int i = 0; i < graph[0].size(); i++) {
            Edge e = graph[0].get(i);
            System.out.println("Destination is "+e.dest+" and" + " "+"Weight is " + e.wt);
        }
    }
}
