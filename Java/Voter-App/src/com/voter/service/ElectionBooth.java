package com.voter.service;

import com.voter.exceptions.LocalityNotFoundException;
import com.voter.exceptions.NoVoterIDException;
import com.voter.exceptions.NotEligibleException;
import com.voter.exceptions.UnderAgeException;

public class ElectionBooth {
	String localities[] = { "ABC Nagar", "XYZ Nagar", "RK Nagar" }; //local DATABASE of Locality

	// if age is less than 18 throw exception
	public boolean checkAge(int age) throws UnderAgeException {     //method for checking Age

		if (age < 18)
			throw new UnderAgeException("under 18 cannt cast vote");//If false throw Exception
		else
			return true;

	}

	// check if the locality matches with the array
	public boolean checkLocality(String locality) throws LocalityNotFoundException {
																//method for checking Locality
		boolean check = false;
		for (String l : localities) {
			if (l.equals(locality)) {
				check = true;
			}

		}
		if (check)
			return true;
		else
			throw new LocalityNotFoundException("locality not found");

	}

	// check if id is within 1000 - 9000
	public boolean checkVoterId(int vid) throws NoVoterIDException {
		if (vid < 1000 || vid > 9000)						//Methods for checking ID's
			throw new NoVoterIDException("enter valid voter ID");
		else
			return true;
	}
	//check Eligibility Of Voter
	public boolean checkEligibility(int age, String locality, int vid) throws NotEligibleException
		{

			try {
				boolean check = checkAge(age);
				if (check) {
					boolean checkLocality = checkLocality(locality);
					if (checkLocality) {
						boolean checkvid = checkVoterId(vid);
						if (checkvid)
							return true;
						
					}

				}
			return true;

			}  catch (NotEligibleException e) {
				throw e;
			}
			

		}

}
