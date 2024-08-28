package JavaPrograms;

public class OneToHundred {

	public static void main(String[] args) {
		int one = 'A'/'A';	
	    String s1 = "..........";

       //without using numbers 
	    
	    for(int i=one; i<=(s1.length()*s1.length()); i++) {
	    	System.out.println(i);

     }
	    // using Ascii Value
	    
	    for(int i=one; i<='d'; i+=one) {
	    	System.out.println(i);
	    }
}
}