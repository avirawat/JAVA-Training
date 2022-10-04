package com.voter.main;

import java.util.Scanner;

import com.voter.exceptions.NotEligibleException;
import com.voter.service.ElectionBooth;

//Main Class user Mode
public class VoterMain {

	public static void main(String[] args) {
		ElectionBooth booth = new ElectionBooth();           //Creation of object Of Election Booth class
		
		Scanner kb = new Scanner(System.in);  
		boolean eligible;

		try {
			System.out.println("enter age ");
			int age = kb.nextInt();                         //Input of Age
			boolean checkAge = booth.checkAge(age); 		//calling checkAge() function for check Age
			if (checkAge) {
				System.out.println("enter locality ");		//If Age is Ok->Input locality
				kb.nextLine();
				String locality = kb.nextLine();			//Input Of Locality
				//calling checkLocality() function for check locality
				boolean checkLocality = booth.checkLocality(locality); 
				if (checkLocality) {
					System.out.println("enter voter id ");
					int vid = kb.nextInt();					//If Locality True check For ID
					//calling checkVoterId() function for checking ID
					boolean checkVid = booth.checkVoterId(vid); 
					if (checkVid) {							//If ID is Okay vote casted
						eligible = booth.checkEligibility(age, locality, vid);
						if (eligible)
							System.out.println("you are eligible for vote");
					}
				}
			}
		}  catch (NotEligibleException e) {		//Handlings Errors By Catch
			System.out.println(e.getMessage()); //Printing Exception message
		}
	}

}
