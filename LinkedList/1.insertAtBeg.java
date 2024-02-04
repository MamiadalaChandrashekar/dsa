import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = next;
    }
}
public class LinkedListInsertAtBeg {

    public static Node insertAtBeg(Node head, int x){
        Node curr = head;
        Node temp = new Node(x);
        temp.next = head;
        return temp;
    }

    public static Node deleteAtBeg(Node head){
        Node curr = head;
        if(head==null){
            System.out.println("null");
        }
        return head.next;
    }

    public static void display(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data+ " ");
            curr=curr.next;
        }
    }

    public static Node search(Node head, int fin){
        Node curr = head;
        while(curr!=null){
            if(curr.data==fin){
                System.out.println(curr.data);
            }
            curr= curr.next;
        }
        return null;
    }

    public static int lengthll(Node head){
        Node curr = head;
        int c=0;
        while(curr!=null){
            curr=curr.next;
            c++;
        }
        return c;
    }

    public static Node MiddleElement(Node head){
        Node curr = head;
        Node slow = head, fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node reversell(Node head){
        Node curr = head;
        Node prev = null;
        Node nodenext;
        while(curr!=null){
            nodenext=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nodenext;
        }
        return prev;
    }

    public static boolean loopLL(Node head){
        Node curr = head;
        Node slow=head, fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(slow==fast){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        LinkedListInsertAtBeg ll = new LinkedListInsertAtBeg();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        if(n==0){
            System.out.println("Error!");
        }
        Node head = null;
        Node curr = null;
        for(int i=0;i<n;i++){
            int dt = sc.nextInt();
            if(i==0){
                head = new Node(dt);
                curr = head;
            }
            else{
                curr.next = new Node(dt);
                curr=curr.next;
            }
        }
        System.out.println("Middle element of LinkedList is : "+ MiddleElement(head).data);
        System.out.println("Element to be inserted : ");
        int val = sc.nextInt();
        System.out.println("After insertion : ");
        head = insertAtBeg(head,val);
        display(head);
        System.out.println("length of linkedlist: ");
        System.out.println(lengthll(head));
        System.out.println("After deletion");
        head = deleteAtBeg(head);
        display(head);
        System.out.println("length of linkedlist after deletion : ");
        System.out.println(lengthll(head));
        System.out.println("reversing LinkedList: ");
        head = reversell(head);
        display(head);
        System.out.println("Loop in linkedlist ? : "+loopLL(head));
        System.out.println("search : ");
        int fin = sc.nextInt();
        head = search(head,fin);
        display(head);



    }
}


output :

Enter the size: 
5
1
2
3
4
5
Middle element of LinkedList is : 3
Element to be inserted : 
7
After insertion : 
7 
1 
2 
3 
4 
5 
length of linkedlist: 
6
After deletion
1 
2 
3 
4 
5 
length of linkedlist after deletion : 
5
reversing LinkedList: 
5 
4 
3 
2 
1 
Loop in linkedlist ? : false
search : 
5
5

