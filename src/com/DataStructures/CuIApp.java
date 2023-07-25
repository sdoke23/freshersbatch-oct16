package com.DataStructures;

import java.util.*;

public class CuIApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String userName = "SUDOKE"; 
		String pass = "sdoke23";
		
		int attempt = 0;
		
		while(attempt < 3) {
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter username: ");
			String uName = sc.nextLine();
			
			System.out.println("Enter password: ");
			String password = sc.nextLine();
			
			if(uName.equals(userName) && password.equals(pass)  ) {
				System.out.println("Welcome " + userName);
				break;
			}
			else {
				attempt ++;
				
				if(attempt < 3) {
					System.out.println("Invalid Credtentials try again ");
					
				}
				else {
					System.out.println("Contact Admin ");
				}
			}
			
		}
		

	}

}
