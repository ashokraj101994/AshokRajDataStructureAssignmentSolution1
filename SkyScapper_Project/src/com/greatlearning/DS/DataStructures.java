package com.greatlearning.DS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


  

public class DataStructures {		
	public static LinkedList<Integer> linkedList = new LinkedList<Integer>();
	class Node{
			  int data;
			  Node next;
	}	  
	      public static Node head;
	      public static Node tail;
	 
	 
	   
	      
	      public void createLinkedList(ArrayList<Integer> arr,int size){
				head=tail;	
				for(int i=0;i<size;i++) {
					linkedList.add(arr.get(i));
					}
				}
			
		 public void insertLinkedList(Node nodeFirst,Node nodeLast, int data) {
				
				Node node = new Node();
				if(tail==null) {
					node.data = data;
				    tail=node;
				    head=node;
				} 
				else {
					node.data=data;
					tail.next=node;
					tail=tail.next;
				}
			}
		
	
	 
    
	public static int getMax(Node head){
		Node curr=head;
		int max=Integer.MIN_VALUE;
		if(head==null) {
			return 0;
		}
		else {
		 while(curr!=null) {
			 if(curr.data>max) {
				 max=curr.data;
				 curr=curr.next;
			 }
			 else {
				 curr=curr.next;
			 }
		 }
		}
		return max;
	}
	public static int getMax1(Node head){
		Node curr=head;
		int max=Integer.MIN_VALUE;
		if(head==null) {
			return 0;
		}
		else {
		 while(curr!=null) {
			 if(curr.data>max) {
				 max=curr.data;
				 curr=curr.next;
			 }
			 else {
				 curr=curr.next;
			 }
		 }
		}
		return max;
	}
		
	 public static void deleteMax(Node nodeFirst,Node nodeLast,int max) {
		 Node curr=head;
		 Node prev=null;
		 if(head==null) {
			 return;
	     }
	     else {
	    	 if(head.data==max) {
	    		 head=curr.next;
	    		 curr=curr.next;
	    		 
	    		 
	    		}
	    	 else {
	    		  while(curr!=null && curr.data!=max) {
	    				prev=curr;
	    				curr=curr.next;
	    		   }
	    		  prev.next=curr.next;
	    		  prev=curr;
	    		 
	    		  
	    	}
	     }
	 }

	public static void deleteMax(LinkedList<Integer> linkedList2, int val) {
		    int i=0;
		    while(linkedList.get(i)!=val) {
		    	i++;
		    
		    }
		    linkedList.remove(i);
		}

	public static int getMax(LinkedList<Integer> linkedlist ) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<linkedlist.size();i++) {
			if(linkedList.get(i)>max) {
				max=linkedList.get(i);
	          }
	     }
		return max;
		}	
}

	
  

