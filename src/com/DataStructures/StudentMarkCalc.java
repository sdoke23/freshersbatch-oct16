package com.DataStructures;

import java.util.*;

public class StudentMarkCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int stud1;
		int stud2;
		int stud3;
		
		System.out.println("Enter marks for stud1 ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks for sub1 ");
		int sub1 = sc.nextInt();
		System.out.println("Enter marks for sub1 ");
		int sub2 = sc.nextInt();
		System.out.println("Enter marks for sub1 ");
		int sub3 = sc.nextInt();
		
		int total = sub1+ sub2 + sub3;
		System.out.println("Total Marks Obtained by Stud1: " + total);
		

	}

}
