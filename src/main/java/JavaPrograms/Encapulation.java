package JavaPrograms;

public class Encapulation {
	
	int a = 12;// instance variable
	static int c = 9;// static variable
	public void add() {
		int b = 10;// local variable 
	}
	
	

	public int getA() {
		return a;
	}



	public void setA(int a) {
		this.a = a;
	}



	public static int getC() {
		return c;
	}



	public static void setC(int c) {
		Encapulation.c = c;
	}



	public static void main(String[] args) {
		
		

	}

}
