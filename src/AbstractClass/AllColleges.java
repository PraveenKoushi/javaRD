package AbstractClass;
abstract class College
{
	abstract void playing();
	abstract void classroom();
	abstract void lab();
	abstract void library();
	abstract void transpotation();
	void faculty()
	{
		System.out.println("Information about teachers/lecturers");
	}

}

class VBIT extends College
{
	void playing()
	{
		System.out.println("VBIT : We support cricket \n Tennis \n Volly Ball. Basket Ball \n Running\n Many other ");
	}
	
	void classroom()
	{
		System.out.println("VBIT : Will supprt 60 students per class room");
	}
	
	void lab()
	{
		System.out.println("VBIT : Compuer lab \n Electrical \n Many more");
	}
	
	void library()
	{
		System.out.println("VBIT : Computer books \n Science books \n EC books \n Many more");
	}
	
	void transpotation()
	{
		System.out.println("VBIT : Bus facility available");
	}
}


class Vasavi extends College
{
	void playing()
	{
		System.out.println("Vasavi : We support cricket \n Tennis  ");
	}
	
	void classroom()
	{
		System.out.println("Vasavi : Will supprt 30 students per class room");
	}
	
	void lab()
	{
		System.out.println("Vasavi : Compuer lab ");
	}
	
	void library()
	{
		System.out.println("Vasavi : Computer books \n Science books \n Many more");
	}
	
	void transpotation()
	{
		System.out.println("Vasavi : Bus facility available");
	}
}


public class AllColleges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		College vbit = new VBIT();
		vbit.classroom();
		vbit.transpotation();
		
		
		College vasavi = new Vasavi();
		vasavi.classroom();
		vasavi.transpotation();
		

	}

}
