package Trees;
import java.util.*;

public class Traversal {
    int data=0;
    Traversal left,right;
    Traversal(int x){
        data=x;
        right=left=null;

    }
    static void preorder(Traversal root){
        if(root==null)return;
        System.out.print(root.data);
        if(root.left !=null)preorder(root.left);
        if(root.right !=null)preorder(root.right);
    }
    static void levelOrderTraversal(Traversal root){
        Queue<Traversal> q=new LinkedList<Traversal>();
        ArrayList<ArrayList<Integer>> anslist=new ArrayList<ArrayList<Integer>>();
        q.offer(root);
        

        while(!q.isEmpty()){
            int qsize=q.size();
            ArrayList<Integer> sublist=new ArrayList<Integer>();
            for(int i=0;i<qsize;i++){
                
                if(q.peek().left !=null)q.offer(q.peek().left);
                if(q.peek().right !=null)q.offer(q.peek().right);
                sublist.add(q.poll().data);
            }
            anslist.add(sublist);
        }
        for(int i=0;i<anslist.size();i++)System.out.print(anslist.get(i));
    }
    public static void main(String args[]){
        Traversal root =new Traversal(1);
        root.left=new Traversal(2);
        root.right=new Traversal(3);
        root.left.left=new Traversal(4);
        root.right.right=new Traversal(7);
        root.right.left=new Traversal(6);
        root.left.right=new Traversal(5);
        preorder(root);
        levelOrderTraversal(root);
    }
}
