import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Building graph for DFS...");
        ArrayList<ArrayList<Integer>> g = new ArrayList<>();
        int n = 9;
        System.out.println("Number of vertices: " + n);

        for (int i = 0; i <= n; i++) {
            g.add(new ArrayList<>());
        }

        // Graph edges (1-indexed)
        g.get(1).add(2);
        g.get(1).add(6);
        g.get(2).add(1);
        g.get(2).add(3);
        g.get(2).add(4);
        g.get(6).add(1);
        g.get(6).add(7);
        g.get(6).add(9);
        g.get(3).add(2);
        g.get(4).add(2);
        g.get(4).add(5);
        g.get(5).add(8);
        g.get(5).add(4);
        g.get(7).add(6);
        g.get(7).add(8);
        g.get(8).add(5);
        g.get(8).add(7);
        g.get(9).add(6);

        // Display adjacency list
        for (int i = 1; i < g.size(); i++) {
            System.out.print("Node " + i + " is connected to: ");
            for (Integer neighbor : g.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }

        // Run DFS
        System.out.println("\nDFS Traversal starting from node 1:");
        Dfs dfsObj = new Dfs();
        dfsObj.dfs(g, 1);
    }
}
