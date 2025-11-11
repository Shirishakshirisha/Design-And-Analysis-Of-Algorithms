import java.util.ArrayList;

public class Dfs {


public void dfs(ArrayList<ArrayList<Integer>> adj, int i)
{
    boolean[] visited = new boolean[adj.size()+1];
    dfsimpl(adj, i, visited);
}
    public void dfsimpl(ArrayList<ArrayList<Integer>> adj, int i,boolean[] visited) {
        
        visited[i]=true;
        System.out.println(i);
        for(int neighbor : adj.get(i)){
            if(!visited[neighbor]){
                dfsimpl(adj,neighbor,visited);
            }
        }
    }

    
}
