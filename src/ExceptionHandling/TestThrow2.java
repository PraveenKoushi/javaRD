package ExceptionHandling;

import java.io.*;  

public class TestThrow2 {   

	//function to check if person is eligible to vote or not   
	//public static void method() throws FileNotFoundException {  

	public static void method() throws IOException {
		FileReader file = new FileReader("C:\\personal\\Java\\eclipse-workspace\\Test\\src\\Notes.txt");  
		BufferedReader fileInput = new BufferedReader(file);  
		
		String line;
        while((line=fileInput.readLine())!= null){
            System.out.println(line);
            System.out.flush();
        }
        fileInput.close();


	//	throw new FileNotFoundException();  

	}  
	//main method  
	public static void main(String args[]) throws IOException{  
		//method();
		try  
		{  
			method();  
		}   
		catch (FileNotFoundException e)   
		{  
			e.printStackTrace();  
		}  
		System.out.println("rest of the code...");    
	}    
}    