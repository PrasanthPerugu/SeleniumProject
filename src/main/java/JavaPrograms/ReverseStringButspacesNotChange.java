package JavaPrograms;

public class ReverseStringButspacesNotChange {

	public static void main(String[] args) {

		String str = "perugu prasanth";
		String rev = "";
		String s1[] = str.split(" ");
		
		for(int i=0; i<s1.length; i++) {
			 String s2 = s1[i];
			
			for(int j=s2.length()-1; j>=0; j--) {
				rev+= s2.charAt(j);
			}
			rev+= " ";
		}
		System.out.println("final String is:"+ rev);
		
	}

}
