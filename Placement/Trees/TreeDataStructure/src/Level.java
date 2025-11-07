
  
//  import java.util.*;
 
// class Level {
//     public List<List<Integer>> levelOrder(TreeNode root) {
//         List<List<Integer>> res = new LinkedList<>();
//         Queue<TreeNode> q = new LinkedList<>();
        
//         if(root == null) return res;
        
//         q.offer(root);
        
//         while(!q.isEmpty()){
//             int len = q.size();
//             List<Integer> subres = new LinkedList<>();
            
//             for(int i = 0; i < len; i++){
//                 if(q.peek().left != null)
//                      q.offer(q.peek().left);
//                 if(q.peek().right != null)
//                      q.offer(q.peek().right);
                
//                 subres.add(q.poll().val);
//             }
//             res.add(subres);
//         }
//         return res;
//     }

//     public static void main(String[] args) {
//         // Create a sample tree:
//         //       1
//         //      / \
//         //     2   3
//         //    / \
//         //   4   5
//         TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)),  new TreeNode(3));
    
//         Level level = new Level();
//         List<List<Integer>> result = level.levelOrder(root);
//         System.out.println(result);
//     }
    
   
// }


import java.util.*;
public class Level {
    public List<List<Integer>> levelOrder(TreeNode root){
        Queue q = new LinkedList<Integer>();
        List<List<Integer>> ans = new LinkedList<>();
        if(root == null){
            return ans;
        }
        q.offer(root);
        

        while(!q.isEmpty())
        {
            int len = q.size();
            List<Integer> inner = new LinkedList<>();
            for(int i=0; i<len; i++)
            {
                if(q.peek().left != null)
                    q.offer(q.peek().left);
                if(q.peek().right !=null)
                    q.offer(q.peek().right);


              inner.add(q.poll().val);
            }
            ans.add(inner);

        }
       
        return ans;
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4) , new TreeNode(5)) , new TreeNode(3));
        Level level = new Level();
        List<List<Integer>> result = level.levelOrder(root);
        System.out.println("result");

    }
}
