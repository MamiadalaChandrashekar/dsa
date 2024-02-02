// Stacks using Collections
import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;


class GFG {
    
   
	public static void main (String[] args) {
	
	    //ArrayDeque<Integer> stack = new ArrayDeque<>();
	    Stack <Integer> stack = new Stack();
	    
	    stack.push(10);
	    stack.push(20);
	    stack.push(30);
	    
	    System.out.println(stack.peek());
	    System.out.println(stack.pop());
	    System.out.println(stack.peek());
	  
	}
	
}

Output:
30
30
20