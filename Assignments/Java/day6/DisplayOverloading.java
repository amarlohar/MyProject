package day6;

public class DisplayOverloading {
	public static void main(String[] args) 
	{
		Overloading ol=new Overloading();
	ol.display('A');
	ol.display('B',1);
	}
}
class Overloading{
	public void display(char name) 
	{
		System.out.println(name);
	}
	
	public void display(char name,int rollNumber) 
	{
		System.out.println(name);
		System.out.println(rollNumber);
	}
}