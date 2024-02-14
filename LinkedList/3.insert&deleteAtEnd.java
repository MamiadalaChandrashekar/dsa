import java.util.*;

class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=next;
    }
}
class Main{
    
    public static void display(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data+ " ");
            curr=curr.next;
        }
    }
    public static Node insertatlast(Node head, int data){
        Node curr = head;
        Node temp= new Node(data);
        if(head==null){
            head=temp;
        }
        else{
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=temp;
        }
        return head;
    }
    public static  Node deleteAtLast(Node head){
        Node curr = head;
        if(head==null){
            System.out.println("error");
        }
        else{
            while(curr.next.next!=null){
                curr=curr.next;
            }
            curr.next=null;
        }
        return head;
    }

    public static void main(String [] args){
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head=null;
        Node curr=null;
        for(int i=0;i<n;i++){
            int c = sc.nextInt();
            if(i==0){
                head = new Node(c);
                curr = head;
            }
            else{
                curr.next= new Node(c);
                curr=curr.next;
            }
        }
        int l = sc.nextInt();
        head = insertatlast(head,l);
        display(head);
        head = deleteAtLast(head);
        display(head);
    }
}