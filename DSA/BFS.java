import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import GraphClassroom.Edge;

public class BFS {
    int src;
    int dst;
    BFS(int s, int d){
        this.src=s;
        this.dst=d;
    }
    public static void printBFS(ArrayList<Edge> graph[] int vertexCount){
        Queue<Integer> q = new LinkedList<>();
        boolean visit[vertexCount] = new boolean[vertexCount];
        while (!q.isEmpty()) {
            int curr=q.remove();
            if(!visit[curr]){
                System.out.print(curr+" ");
                visit[curr] = true;
                for(int i=0; i<graph[curr].size; i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.dst);
                }
            } 
        }
        
    }


    public static void main(String[] args) {
        int vertexCount=5;
        ArrayList<Edge>graph[] = new ArrayList[vertexCount];
        printBFS(graph);
        bfs(graph,vertexCount);
    }
}
