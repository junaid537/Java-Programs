import java.util.*;

    class Pair{
    TopViewOfBT hd;
    int line;
    public Pair(TopViewOfBT hd , int line){
        this.hd=hd;
        this.line=line;
    }
}
public class TopViewOfBT {
    int data;
    TopViewOfBT left,right;
    public TopViewOfBT(int data){
        this.data=data;
    }
    static List<Integer> levelOrderTraversal(TopViewOfBT root){
        Queue<Pair> q=new LinkedList<Pair>();
        List<Integer> ans=new LinkedList<Integer>();
        Map<Integer,Integer> mpp=new TreeMap<Integer,Integer>(); //ordered by keys by default
        q.offer(new Pair(root,0));
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                Pair it=q.remove();
                TopViewOfBT head=it.hd;
                int line=it.line;
                if(mpp.get(line)==null){mpp.put(line,head.data);}
                if(head.left !=null)q.add(new Pair(head.left,line-1));
                if(head.right !=null)q.add(new Pair(head.right,line+1));
            }

        }
        for (Map.Entry<Integer,Integer> entry : mpp.entrySet()) {
            //ans.add(entry.getValue()); 
            System.out.print(entry.getValue());
        }
        System.out.println();
        return ans;
    }
    public static void main(String[] args) {
        TopViewOfBT root=new TopViewOfBT(1);
        root.left=new TopViewOfBT(2);
        root.right=new TopViewOfBT(3);
        root.left.left=new TopViewOfBT(4);
        root.left.right=new TopViewOfBT(5);
        root.right.left=new TopViewOfBT(6);
        root.right.right=new TopViewOfBT(7);

        List<Integer> ans=new LinkedList<Integer>();
        ans=levelOrderTraversal(root);
        for(int i=0;i<ans.size();i++){
            //System.out.print(ans.get(i));
        }
    }
}
