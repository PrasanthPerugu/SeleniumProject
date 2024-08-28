package JavaPrograms;

public class StringDemo1 {
	
	public static void main(String[] args) {
        
		String finalised = "";
		String str = "abc xyz";
		String s []	= str.split(" ");
		
		for(int i=0;i<s.length;i++ ) {
			String s2 = s[i];
		
			for(int j=s2.length()-1; j>=0; j--) {
				finalised +=s2.charAt(j);
			}
			finalised += " ";
	}
		System.out.println("print final String is :"+ finalised );
}
}

