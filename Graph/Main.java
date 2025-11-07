import java.util.*;



public class Main {
    public static void main(String[] args){
        System.out.println("The graph for the bfs");
        ArrayList<ArrayList<Integer>> g = new ArrayList<>();
        int n = 9;
        System.out.println("Enter the number of vertices in the array : " + n);
        for(int i=0; i<=n; i++){
           g.add(new ArrayList<>());
        }
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





        for(int i=1; i<g.size(); i++){
        System.out.println("Node " + i + "is connected to : ");
        for(Integer neighbor : g.get(i)){
            System.out.println(neighbor + " ");
        }
        System.out.println();
    }

    Bfs bfsObj = new Bfs();
        bfsObj.bfs(g, 1); // Start BFS from node 1


    }
    
    
}
