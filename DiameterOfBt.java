//Diamter of a tree in Binary  Tree

import java.util.*;

public class DiameterOfBt{
    static class Node{
        int data ;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left = null;
            this.right=null;

        }


    }
    static class BinaryTree{
        static int idx= -1;
        public static Node buildtree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);

            return newNode;
        }

    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data + " ");
        inorder(root.right);
        
    }
    
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data + " ");
        
        
    }
    public static void levelOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.println(currNode.data + " ");
                if(currNode.left!= null){
                    q.add(currNode.left);
                }if(currNode.right!=null){
                      q.add(currNode.right);
                }
            }
        }
    }
}
        public static int height(Node root){
            if (root==null){
                return 0;

            }
            int leftheight = height(root.left);
            int rightheight = height(root.right);
            int myheight = Math.max(leftheight , rightheight) + 1;
            return myheight;
          
        }

        public static int diameter(Node root){
            if(root==null){
                return 0;
            }
            int diam1=diameter(left.root);
            int diam2=diameter(right.root);
            int diam3=height(root.right)+height(root.left)+1;
            return Math.max(diam3, Math.max(diam1,diam2));

        }

    public static void main(String[] args){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(diameter(root));
      }
}
 