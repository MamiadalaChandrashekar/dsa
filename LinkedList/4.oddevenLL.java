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
    public static Node oddeven(Node head){
        Node curr = head, temp;
        Node evenhead=new Node(0);
        Node eventail = evenhead;
        Node oddhead=new Node(0);
        Node oddtail = oddhead;
        while(curr!=null){
            temp=curr;
            curr = curr.next;
            temp.next=null;
            
            if(temp.data%2!=0){
                oddtail.next=temp;
                oddtail=temp;
            }
            else{
                eventail.next=temp;
                eventail=temp;
            }
        }
        eventail.next=oddhead.next;
        return evenhead.next;
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
        head = oddeven(head);
        display(head);

    }
}