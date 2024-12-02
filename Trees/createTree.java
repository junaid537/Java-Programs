public class createTree{
    int data;
    createTree left,right;
    public createTree(int key){
        data=key;
    }
    public static void main(String[] args) {
        createTree root= new createTree(1);
        root.left=new createTree(2);
        root.right=new createTree(3);
        
    }
}