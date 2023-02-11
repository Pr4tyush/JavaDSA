// sum  of nodes in Binary Search Tree

import java.util.*;

public class SumofNode{
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
        public static int countofNodes(Node root){
            if (root==null){
                return 0;
            }
            int leftNodes = countOfNodes(root.left);
            int rightNodes = countOfNodes(root.right);

            return root.left+root.right+1 ;
        }

        
    

    public static void main(String[] args){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(nodes);
        levelOrder(root);
    }
}
 