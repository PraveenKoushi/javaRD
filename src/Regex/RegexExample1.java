package Regex;
import java.util.regex.*;

public class RegexExample1{  
public static void main(String args[]){  
//1st way  
//Pattern p = Pattern.compile(".u");//. represents single character  
//Matcher m = p.matcher("Aulya");  
//boolean b = m.matches();  
//
//System.out.println("Checking String is ");
//System.out.println(b);


  
////2nd way  
boolean b2=Pattern.compile("a").matcher("as").matches();  

System.out.println(b2);
  
////3rd way  
//boolean b3 = Pattern.matches(".s", "as");  
//  
//System.out.println(b+" "+b2+" "+b3);  
}}  