import java.util.*;

class Graph
{
    private int V; 
    private LinkedList<Integer> adj[]; 
    Graph(int v)
    {
        V = v;
        adj = new LinkedList[V];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList<Integer>();
    }
 
    // to add an edge 
    void addEdge(int v,int w)
    {
        adj[v].add(w);
        adj[w].add(v);
    }
 
    // A recursive function that uses visited[] and parent
    // to detect cycle in subgraph reachable from vertex v.
    boolean isCyclicUtil(int v, boolean visited[], int parent){
        visited[v] = true;
        Integer i;
        Iterator<Integer> it = adj[v].iterator();
        while (it.hasNext()){
            i = it.next();
            if (!visited[i])
            {
                if (isCyclicUtil(i, visited, v))
                    return true;
            }
 
            // If an adjacent is visited and not parent of current vertex, then there is a cycle.
            else if (i != parent)
            return true;
        }
        return false;
    }
 
    // Returns true if the graph is a tree, else false.
    boolean isTree(){
       
        boolean visited[] = new boolean[V];
        for (int i = 0; i < V; i++)
            visited[i] = false;
 
        if (isCyclicUtil(0, visited, -1))
            return false;
 
        for (int u = 0; u < V; u++)
            if (!visited[u])
                return false;
 
        return true;
    }
}
public class Question_1{ 
    // Driver method
    public static void main(String args[]){

        Graph g = new Graph(5);
        g.addEdge(1, 0);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(3, 4);
        if (g.isTree())
            System.out.println("Graph is Tree");
        else
            System.out.println("Graph is not Tree");
    }
}