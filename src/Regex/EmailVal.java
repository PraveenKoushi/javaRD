package Regex;

import java.util.regex.*;

public class EmailVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String regex = "^(.+)@(.+)$";
		
		String regex="^[A-Za-z]+@(.+)$";
		
		System.out.println(Pattern.matches(regex, "Manasa@tcm.com"));
		System.out.println(Pattern.matches(regex, "sfsfgfsdfhdsffdh@fndsbfdsnfbsnd"));
		System.out.println(Pattern.matches(regex, "Asdf123@$%^"));
		System.out.println(Pattern.matches(regex, "Priyankatcm.com"));
		

	}

}
