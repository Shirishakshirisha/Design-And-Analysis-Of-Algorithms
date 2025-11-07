
class AVL {

    public class Node {
      private int value;
      private Node left;
      private Node right;
      private int height;
  
      public Node(int value) {
        this.value = value;
      }
  
      public int getValue() {
        return value;
      }
    }
  
    private Node root;
  
    public AVL() {
  
    }

  
  public void insert(int value){
    root = insert(value , root);
  }

  private Node insert(int value , Node node){
    if(node == null){
      node = new Node(value);
      return node;
    }
    if(value<node.value){
      node.left = insert(value , node.left);
    }
    if(value >node.value){
      node.right = insert(value , node.right);
    }
    node.height = Math.max(height(node.left),height(node.right))+1;
    return rotate(node);

  }

  public int height()
  {
    return height(root);
  }
  private int height(Node root)
  {
    if(node == null)
    {
      return -1;
    }
    return node.height;
  }


  private Node rotate(Node node)
  {
    if(height(node.left)-height(node.right)>1)
    {
      if(height(node.left.left)-height(node.left.right)>0)
      {
        return rightRotate(node);
      }
      if(height(node.left.left)-height(node.left.right)<0)
      {
        node.left = leftRotate(node.left);
        return rightRotate(node);
      } 
    }

    if(height(node.left)-height(node.right)<-1)
    {
      if(height(node.right.left)-height(node.right.left)<0)
      {
        return leftRotate(node);
      }
      if(height(node.right.left)-height(node.right.right)>0)
      {
        node.right = rightRotate(node.right);
        return leftRotate(node);
      } 
    }
    return node;
  }


  public Node rigtRotate(Node p)
  {
    Node c = p.left;
    Node t = c.right;
    c.right = p;
    p.right=t;

    p.height = Math.max(height(p.left) , height(p.right)+1);
    c.height = Math.max(height(c.left),height(c.right)+1);

    return c;
  }

  public Node leftRotate(Node c)
  {
    Node p = c.left;
    Node t = p.right;
    p.right = c;
    c.right=t;

    c.height = Math.max(height(p.left) , height(p.right)+1);
    p.height = Math.max(height(c.left),height(c.right)+1);

    return p;
  }


public void poulate(int[] nums)
{
  for(int i=0; i<nums.length; i++)
  {
    this.insert(nums[i]);
  }
}


  }
  