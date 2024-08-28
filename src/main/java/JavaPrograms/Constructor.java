package JavaPrograms;

public class Constructor {

	public Constructor(int a ) {
		a = 10;
		System.out.println(a);
	}

	public Constructor(int b, int d) {
		b = 10;
		d = 20;
		System.out.println(b + d);
	}

	public Constructor(char d, int a) {
		d = 1000;
		System.out.println(d + a);
	}

	public Constructor() {
		System.out.println("defaulit constructor");
	}

	public static void main(String[] args) {
		Constructor c = new Constructor();
	}

}
