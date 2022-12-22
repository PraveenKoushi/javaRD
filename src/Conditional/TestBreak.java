package Conditional;

import java.util.ArrayList;

public class TestBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al= new ArrayList();
		al.add('M');
		al.add('P');
		al.add('A');
		al.add('T');
		al.add('L');
		al.add('N');
		int alsize = al.size();
		
		for(int i=0;i<al.size();i++)
		{
			
			char ch= (char) al.get(i);
			
		switch(ch)
		{
		case 'L':      System.out.println("This is Lakshmi"); break;
		case 'M':      System.out.println("This is Manasa"); break;
		case  'T':     System.out.println("This is Thousifa"); break;
		case 'P': System.out.println("This is Priyanka or Praveen"); break;
		case  'A': System.out.println("This is Amulya"); break;
		default:  System.out.println("None of the names are matching for  "  +ch); break;
		
		}
		}

	}

}
