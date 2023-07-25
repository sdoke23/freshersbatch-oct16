package com.DataStructures;

import java.util.*;

public class ResultCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter marks for subject 1:  ");
		int sub1 = sc.nextInt();
		System.out.println("Enter marks for subject 2:  ");
		int sub2 = sc.nextInt();
		
		System.out.println("Enter marks for subject 3:  ");
		
		int sub3 = sc.nextInt();
		
		if(sub1 > 60 && sub2 > 60 && sub3 >60) {
			System.out.println("The candidate has passed  ");
		}
		
		else if (sub1 < 60 && sub2 >60 && sub3 > 60) {
			System.out.println("The candidate has been promoted  ");
		}
		else if (sub1 > 60 && sub2 < 60 && sub3 > 60) {
			System.out.println("The candidate has been promoted  ");
		}
		else if (sub1 > 60 && sub2 > 60 && sub3 < 60) {
			System.out.println("The candidate has been promoted  ");
		}
		else if (sub1 > 60 && sub2 < 60 && sub3 < 60) {
			System.out.println("The candidate has been failed  ");
		}
		else if (sub1 < 60 && sub2 > 60 && sub3 < 60) {
			System.out.println("The candidate has been failed  ");
		}
		else if (sub1 < 60 && sub2 < 60 && sub3 > 60) {
			System.out.println("The candidate has been failed  ");
		}
		else {
			System.out.println("The candidate has been demoted");
		}

	}

}
