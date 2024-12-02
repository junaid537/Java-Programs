
import java.util.*;
public class LevelWiseTraversal {
    int data;
    LevelWiseTraversal left;
    LevelWiseTraversal right;
    public LevelWiseTraversal (int data){
        this.data=data;
    }
    public static void traverse(LevelWiseTraversal root){  
        Queue<LevelWiseTraversal> q=new LinkedList<LevelWiseTraversal>();
        List<List<Integer>> ans=new  LinkedList<List<Integer>>();
        q.offer(root); 
        while(!q.isEmpty()){
            int n=  q.size();
            List<Integer> subList=new  LinkedList<Integer>();
            for(int i=0;i<n;i++){
                if(q.peek().left !=null)q.offer(q.peek().left);
                if(q.peek().right!=null)q.offer(q.peek().right);
                subList.add(q.peek().data);
                q.remove();
            }
            ans.add(subList);
        }
        for(int i=0;i<ans.size();i++)System.out.print(ans.get(i));
        
    }
    public static void main(String[] args) {
        LevelWiseTraversal root =new LevelWiseTraversal(1);
        root.left=new LevelWiseTraversal(2); 
        root.right=new LevelWiseTraversal(3); 
        root.left.left=new LevelWiseTraversal(4); 
        root.left.right=new LevelWiseTraversal(5); 
        root.right.left=new LevelWiseTraversal(6); 
        root.right.right=new LevelWiseTraversal(7); 
        traverse(root);
    }
}
