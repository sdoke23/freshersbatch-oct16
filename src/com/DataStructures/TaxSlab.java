package com.DataStructures;

import java.util.*;

public class TaxSlab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your ctc:  ");
		long ctc = sc.nextLong();
		
		double tax = 0;
		
		if(ctc<180000) {
			tax = 0;
		}
		else if (ctc > 181000 && ctc <= 300000) {
			
			tax = (ctc*0.1);	
		}
		else if (ctc > 300001 && ctc <= 500000) {
			
			tax = (ctc*0.2);	
		}
		else if(ctc > 500001 && ctc <= 1000000) {
		
			tax = (ctc*0.3);	
		}
		
		else {
			tax= (ctc* 0.35);
		}
		System.out.println("Tax for ctc: " + ctc + " is " + tax);
		
}

}
