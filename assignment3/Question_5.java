import java.util.ArrayList;
class Graph5
{
	int vertices;
	ArrayList<Integer> edge[];

	Graph5(int vertices){
		this.vertices = vertices;
		edge = new ArrayList[vertices+1];
		for (int i = 0; i <= vertices; i++)
		{
			edge[i] = new ArrayList<>();
		}
	}
	void addEdge(int a,int b){
		edge[a].add(b);
	}

	void dfs(int node, ArrayList<Integer> adj[], int dp[],boolean visited[]){
		visited[node] = true;
		for (int i = 0; i < adj[node].size(); i++)
		{
			if (!visited[adj[node].get(i)])
				dfs(adj[node].get(i), adj, dp, visited);
			dp[node] = Math.max(dp[node], 1 + dp[adj[node].get(i)]);
		}
	}
	int findLongestPath(){      
              int n = vertices;
		ArrayList<Integer> adj[] = edge;
		int[] dp = new int[n+1];
		boolean[] visited = new boolean[n + 1];
		for (int i = 1; i <= n; i++){
			if (!visited[i])
				dfs(i, adj, dp, visited);
		}

		int res = 0;
		for (int i = 1; i <= n; i++){
			res = Math.max(res, dp[i]);
		}

		return res;
	}
}

public class Question_5{
	public static void main(String[] args){
		Graph5 graph = new Graph5(8);
		graph.addEdge( 1, 4);
		graph.addEdge( 2, 4);
		graph.addEdge( 3, 4);
		graph.addEdge( 4, 5);
		graph.addEdge( 4, 6);
		graph.addEdge( 4, 7);
		graph.addEdge( 5, 8);
		graph.addEdge( 6, 8);
		graph.addEdge( 7, 8);
		System.out.println( "Graph will have longest path of length: " + graph.findLongestPath());
	}
}