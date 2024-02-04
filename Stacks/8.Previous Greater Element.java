//Previous Greater Element
import java.io.*;
import java.util.*;

class GFG {
    
    public static void printPrevGreater(int arr[],int n){
    
        for(int i=0;i<n;i++){
            int j;
            for(j=i-1;j>=0;j--){
                if(arr[j]>arr[i]){
                    System.out.print(arr[j]+" ");
                    break;
                }
            }
            if(j==-1)
                System.out.print(-1+" ");
        }
    }
	public static void main (String[] args) {
	
	    int[] arr=new int[]{20,30,10,5,15};
        
        printPrevGreater(arr,arr.length);   
	  
	}
	
}

Output:
-1 -1 30 10 30 



//Next Greater Element :

import java.io.*;
import java.util.*;

class GFG {
    
    public static void printGreater(int arr[],int n){
    
        for(int i=0;i<n;i++){
            int j;
            for(j=i+1;j<n;j++){
                if(arr[j]>arr[i]){
                    System.out.print(arr[j]+" ");
                    break;
                }
            }
            if(j==n)
                System.out.print(-1+" ");
        }
    }
	public static void main (String[] args) {
	
	    int[] arr=new int[]{5,15,10,8,6,12,9,18};
        
        printGreater(arr,arr.length);   
	  
	}
	
}

Output:
15 18 12 12 12 18 18 -1 