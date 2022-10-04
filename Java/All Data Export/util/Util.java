package com.monster.npd.submission.util;

import java.util.Date;

public class Util {
    //this function for checking Integer in String Value
	public static boolean isNumeric(String strNum) {

		if (strNum == null) {
			return false;
		}
		try {
			int d = Integer.parseInt(strNum);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}
	 //this function for checking Date in String Value
	public static boolean isValidDate(String strNum) {

		if (strNum == null) {
			return false;
		}
		try {
			long d = Date.parse(strNum);
		} catch (IllegalArgumentException nfe) {
			return false;
		}
		return true;
	}
	 //this function for checking Double value in String Value
	public static boolean isDouble(String strNum) {

		if (strNum == null) {
			return false;
		}
		try {
			double d = Double.parseDouble(strNum);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}
	

}
