package com.greatlearning.DS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import com.greatlearning.DS.DataStructures.Node;


public class Services {
	
	static Services obj=new Services();
	class Node2{
	     int data;
	     Node2 next;
    }
     
     public static Node2 head2;
     public static Node2 tail2;
	public static Queue <Integer> queue = new LinkedList<Integer>();
	public static LinkedList<Integer> LinkingList = new LinkedList<Integer>();
	
	public static void floorAssembler(int val,int i, ArrayList<Integer> arr,Node nodeFirst,Node nodeLast, Node2 head2, Node2 tail2) {
    	if(i==1) {
    		 if(arr.get(i-1)==DataStructures.getMax(DataStructures.linkedList)) {
    			 queue.add(val);
        		 System.out.println(queue);
        		 while(!queue.isEmpty()) {
        			queue.remove();
        			}
        		 DataStructures.deleteMax(DataStructures.linkedList,val);
        		 }
    		 
    		 else {
    			System.out.println(" ");
    			LinkingList.add(val);
    		  }
    	}
    	  else {
    		  if(arr.get(i-1)==DataStructures.getMax(DataStructures.linkedList)) {
    			  queue.add(val);
    			  getElements(LinkingList,val,DataStructures.linkedList);
    			  System.out.println(queue);
    			
    			  while(!queue.isEmpty()) {
          			queue.remove();
          		}
    			
    	      }
    		  else {
    			  System.out.println(" ");
      			  LinkingList.add(val);
    		  }
    	  }
      }


	private static void getElements(LinkedList<Integer> linkingList, int val, LinkedList<Integer> linkedList) {
		       DataStructures.deleteMax(linkedList, val);
		       int max=DataStructures.getMax(linkedList);
			   for(int i=0;i<linkingList.size();i++) {
			      if(linkingList.get(i)==max) {
					queue.add(max);
					getElements(LinkingList,max, linkedList);
				   }
			      }
			      
	          }

	private static void getElements(LinkedList<Integer> linkingList2,int val,Node nodeFirst,Node nodeLast) {
		   
		      DataStructures.deleteMax(nodeFirst,nodeLast,val);
		      int max =DataStructures.getMax(nodeFirst);
			     if(DataStructures.head==null) {
			    	 return;
			     }
			     else {
			     int i=0;
			     while(i<LinkingList.size()) {	 
			      if(linkingList2.get(i)==max) {
					queue.add(max);
					getElements(LinkingList,max,DataStructures.head,DataStructures.tail);
					
				  }
				   i++;
				 }
			     
			     }
			   }
			 
			  
			 
			  
			


	public void AddList(Node2 head2, Node2 tail2, int val) {
		  Node2 node=new Node2();
	}


	
      
}

