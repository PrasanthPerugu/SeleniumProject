package JavaPrograms;

public class RemoveCharacters {

	public static void main(String[] args) {
		
		String str = "Selenium@123";
		String results = str.replaceAll("[^a-zA-Z\\s]","");
		
		System.out.println("original output"+str);
		System.out.println("String after removing special characters" + results);

	}

}
