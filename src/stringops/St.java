package stringops;

import java.util.StringTokenizer;  
public class St{  
	public static void main(String args[]){  
		StringTokenizer st = new StringTokenizer("Vijayawada_Nadigama_Kodad_Jaggayyapet_Suryapet_Npalli_Hyderabad","_");  
		while (st.hasMoreTokens()) {  
			String name = st.nextToken();
			//System.out.println(name);
			String rtoken="Suryapet";
			if(name.equals(rtoken))
			{
				System.out.println("Name is found in the list of tokens " +name);
			}
			else
			{
				System.out.println("Requested token not found "+rtoken);
			}
		}  
		
		//System.out.println(st.countTokens());
	}  
}  