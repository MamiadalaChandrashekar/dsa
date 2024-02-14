import java.util.*;
class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next= null;
    }
}
public class Main {

    public static Node reversell(Node head){
        Node curr = head;
        Node prev = null;
        Node nextnode = null;
        while(curr!=null){
            nextnode = curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextnode;
        }
        return prev;
    }
    
    public static boolean palindromell(Node head){
        Node curr = head;
        Node slow=head , fast =head;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node newhead = reversell(slow);
        while(head!=null && newhead!=null){
            if(head.data!=newhead.data){
                return false;
            }
            head=head.next;
            newhead=newhead.next;
        }
        return true;
    }
    public static void display(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data+" ");
            curr=curr.next;
        }
    }
    public static void main(String [] args){
        Main pal = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of LinkedList: ");
        int n = sc.nextInt();
        Node curr = null;
        Node head = null;
        System.out.println("Enter the Elements: ");
        for(int i=0;i<n;i++){
            int dt = sc.nextInt();
            if(i==0){
                head = new Node(dt);
                curr = head;
            }
            else{
            curr.next=new Node(dt);
            curr=curr.next;
            }
        }
        System.out.println("Elements in LinkedList are : ");
        display(head);
        System.out.println("reverse in LinkedList are : ");
        head = reversell(head);
        display(head);
        
        if(palindromell(head)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
