package JavaPrograms;

public class ReversegivenNumber {

	public static void main(String[] args) {
		
		int n = 123456789;
		while(n!=0) {
			
			int r=n%10;
			System.out.print(r);
			n=n/10;
		}

	}

}
