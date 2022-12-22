package Regex;

import java.util.regex.*;  
class RegexExample4{  
	public static void main(String args[]){  
		System.out.println("? quantifier ....");  
	//	System.out.println(Pattern.matches("[amn]?", "n"));//true (a or m or n comes one time)  
//		System.out.println(Pattern.matches("[amn]?", "aaa"));//false (a comes more than one time)  
	//	System.out.println(Pattern.matches("[amn]?", "aammmnn"));//false (a m and n comes more than one time)  
		//System.out.println(Pattern.matches("[amn]?", "aazzta"));//false (a comes more than one time)  
	//	System.out.println(Pattern.matches("[amn]?", "am"));//false (a or m or n must come one time)  
//
//		System.out.println("+ quantifier ....");  
//		System.out.println(Pattern.matches("[amn]+", "a"));//true (a or m or n once or more times)  
//		System.out.println(Pattern.matches("[amn]+", "aaa"));//true (a comes more than one time)  
	//	System.out.println(Pattern.matches("[amn]+", "aammmnn"));//true (a or m or n comes more than once)  
		//System.out.println(Pattern.matches("[amn]+", "aazzta"));//false (z and t are not matching pattern)  
//
//		System.out.println("* quantifier ....");  
	//	System.out.println(Pattern.matches("[amn]*", ""));//true (a or m or n may come zero or more times)  

	}}  


//.	Any character (may or may not match terminator)
//\d	Any digits, short of [0-9]
//\D	Any non-digit, short for [^0-9]
//\s	Any whitespace character, short for [\t\n\x0B\f\r]
//\S	Any non-whitespace character, short for [^\s]
//\w	Any word character, short for [a-zA-Z_0-9]
//\W	Any non-word character, short for [^\w]
//\b	A word boundary
//\B	A non word boundary
