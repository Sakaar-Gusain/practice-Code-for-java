//Depth First of A graph
import java.util.*;
import java.util.LinkedList;

public class GraphDFS {
    private LinkedList<Integer> adjLists[];
    private boolean visited[];

    public GraphDFS(int vertices) {
        adjLists = new LinkedList[vertices];
        visited = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            adjLists[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int src, int dest) {
        if (src >= 0 && src < adjLists.length && dest >= 0 && dest < adjLists.length) {
            adjLists[src].add(dest);
        } else {
            System.out.println("Invalid vertex input");
        }
    }

    public void DFS(int vertex) {
        if (vertex >= 0 && vertex < adjLists.length) {
            visited[vertex] = true;
            System.out.print(vertex + " ");

            Iterator<Integer> ite = adjLists[vertex].listIterator();
            while (ite.hasNext()) {
                int adj = ite.next();
                if (!visited[adj]) {
                    DFS(adj);
                }
            }
        } else {
            System.out.println("Invalid vertex input");
        }
    }

    public static void main(String[] args) {
        GraphDFS g = new GraphDFS(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 3);

        System.out.println("Following is DFS:");
        g.DFS(0); // Start DFS from vertex 0
    }
}