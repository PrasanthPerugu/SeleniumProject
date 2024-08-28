package JavaPrograms;

public class ArraysDemo {
	
	public static void moveszerostoEnd(int [] arr) {
	
	int n = arr.length;
	int count = 0;
	
	for (int i = 0; i < n; i++) {
        if (arr[i] != 0) {
            arr[count++] = arr[i];
        }
    }
	
	 while (count < n) {
         arr[count++] = 0;
     }
     
     // Print the modified array
     for (int num : arr) {
         System.out.print(num + " ");
     }
 }
	
	public static void main(String[] args) {
		int[] arr = {1, 4, 3, 5, 0, 7, 8, 0, 0, 7, 0, 4};
		 moveszerostoEnd(arr);

	}

}
