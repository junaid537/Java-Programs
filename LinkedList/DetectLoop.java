
import java.util.*;
public class DetectLoop {

    Node head;
    private int size;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            size+=1;
        }
    } 
    public void pushAtBeg(int data){
        Node n=new Node(data);
        if (head==null){
            head=n;
            return;
        }
        n.next=head;
        head=n;
    }
    public void printAll(){
        Node currhead=head;
        while(currhead!=null){
            System.out.print(currhead.data+"->");
            currhead=currhead.next;
        }
        System.out.print("null");
    }
    public boolean loopDetection(){
        Node currhead=head;
        HashSet<Node> s= new HashSet<Node>();
        while(currhead!=null){
            if(s.contains(currhead))return true;
            s.add(currhead);
            currhead=currhead.next;
        }
        return false;
            
    }
    public boolean floydDetection(){
        Node fast=head,slow=head;
        while(fast.next!=null ){
            if( fast.next.next!=null)return false;
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)return true;
        }
        return false;
    }
    public Node reverse(){
        Node dummy=null,nextt=head;
        while(head!=null){ 
            nextt=head.next;
            head.next=dummy;
            dummy=head;
            head=nextt;
        }
        System.out.println(dummy.data);
        return dummy;
       
    }
    public static void main(String[] args) {
        DetectLoop list=new DetectLoop();
        list.pushAtBeg(10);
        list.pushAtBeg(20);
        list.pushAtBeg(30);
        list.printAll();
       
        //creating loop
        // list.head.next.next.next=list.head;
        boolean ans=list.loopDetection();
        boolean ans1= list.floydDetection();
        System.out.println();
        System.out.println(ans);
        System.out.println(ans1);
        
         Node a=list.reverse();
        //System.out.println(a.data);
        list.head=a;
        list.printAll();
        //removeNthNodeFromEndofLinkedList() see leetcode
    }
}
