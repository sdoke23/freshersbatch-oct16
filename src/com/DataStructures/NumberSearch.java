package com.DataStructures;

import java.util.*;

public class NumberSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]  = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number ");
		
		int i = sc.nextInt();
		
		boolean found = false;
		
		
		for(int j=0; j<arr.length; j++){
			if(arr[j]==i) {
				found = true;
				break;
			}
			
		}if(found) {
			System.out.println(i + "  is present in array");
		}
		else {
			System.out.println(i + " is not present in array ");
		}
		

	}

}
