package JavaPrograms;

public class EvenNumberinGiven {

	public static void main(String[] args) {
		
		int n = 123456789;
		int count = 0;
		
		while(n!=0) {
			int r = n%10;
			if(r%2==0) {
				count = count+r;
			}
			n=n/10;
		}
		
		System.out.println(count);
	}

}
