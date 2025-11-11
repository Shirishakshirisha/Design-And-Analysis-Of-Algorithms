import java.util.*;

public class Bfs {

   public void bfs(ArrayList<ArrayList<Integer>> g, int start) {
        boolean[] visited = new boolean[g.size()];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);
        visited[start] = true;

        System.out.println("BFS traversal starting from node " + start + ":");

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int neighbor : g.get(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    }
   



















