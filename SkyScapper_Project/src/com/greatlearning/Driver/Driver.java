package com.greatlearning.Driver;

import java.util.ArrayList;
import java.util.Scanner;
import com.greatlearning.DS.DataStructures;
import com.greatlearning.DS.Services;


public class Driver {
   public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.println("enter the total no of floors in the building");
        int size=in.nextInt();
		ArrayList <Integer> arr = new ArrayList<Integer>(size);
		DataStructures list = new DataStructures();
        for(int i=1;i<=size;i++) {
	    	System.out.println("enter the floor size given on day : " + i);
	    	int n=in.nextInt();
	    	arr.add(n);
	    	}
	    list.createLinkedList(arr,size);
	    for(int i=1;i<=size;i++) {
	    	System.out.println("Day : " + i);
	    	Services.floorAssembler(arr.get(i-1), i, arr,DataStructures.head,DataStructures.tail,Services.head2,Services.tail2);
	    }
     }

}
