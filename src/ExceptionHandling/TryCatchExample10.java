package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;  
import java.io.PrintWriter;  
  
public class TryCatchExample10 {  
  
    
	public static void main(String[] args) {  
          
          
     	 PrintWriter pw = null; 
     	 File Fileright = new File("C:\\personal\\Java\\eclipse-workspace\\Test\\src\\Notes.txt");
     	 
     	 
        try {
    
            pw = new PrintWriter(Fileright); //may throw exception   
            pw.println("Manasa");  
            pw.println("Thousifa");
            pw.println("Laxmi");
            pw.println("Priyanka");
            pw.println("Amulya---");
        }  
// providing the checked exception handler  
 catch (FileNotFoundException e) {  
              
            System.out.println(e);  
        } 
        pw.close();
      
    System.out.println("File saved successfully");  
    }  
}  