package com.DataStructures;

import java.util.*;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int num = sc.nextInt();
		
		if(isArmstrongNumber(num)) {
			System.out.println(num + " is an Armstrong Number " );
			
		}else {
			System.out.println(num + " is not an Armstrong Number ");
		}

	}
	
	public static boolean isArmstrongNumber(int num) {
		int originalNumber = num;
		int numDigits = countDigits(num);
		int sum = 0;
		
		while(num>0) {
			int digit = num % 10;
			sum += Math.pow(digit, numDigits);
			num /= 10;
		}
		return sum == originalNumber;
	}
	
	public static int countDigits(int num) {
		
		int count  = 0;
		while (num != 0){
			num /= 10;
			count++;
		}
		return count;
		
		
	}

}
