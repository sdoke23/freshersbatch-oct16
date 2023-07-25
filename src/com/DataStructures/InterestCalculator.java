package com.DataStructures;

import java.util.*;

public class InterestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the principal amount: ");
		
		double principal = sc.nextDouble();
		
		System.out.println("Enter the interest rate(in %) : ");
		
		double rate = sc.nextDouble();
		
		System.out.println("Enter the time period (in years): ");
		
		double time = sc.nextDouble();
		
		
		double simpleInterest = calculateSimpleInterest(principal, rate, time);
		double compoundInterest = calculateCompoundInterest(principal, rate, time);
		
		System.out.println("Simple Interest: " + simpleInterest);
		System.out.println("Compound Interest: " + compoundInterest);
		
		}
	public static double calculateSimpleInterest(double principal, double rate, double time) {
		return (principal*rate*time)/100.0;
	}
	public static double calculateCompoundInterest(double principal, double rate, double time) {
		double compoundAmount = principal * Math.pow((1+rate/100), time);
		return compoundAmount - principal;
	}

}
