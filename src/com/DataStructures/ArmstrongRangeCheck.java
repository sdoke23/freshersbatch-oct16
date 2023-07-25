package com.DataStructures;

public class ArmstrongRangeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isArmstrong(153);
		
		for(int i = 100; i<=999; i++) {
			if(isArmstrong(i)) {
				System.out.println(i);
			}
		}
		
	}
		public static boolean isArmstrong(int a) {
			int j = a;
			int result = 0;
			while(a>0) {
				int rem = a%10;
				result = (int)(result+Math.pow(rem, 3));
				a = a/10;
				
			}
			if(result == j) {
				return true;
			}
			else {
				return false;
			}
		}


}
