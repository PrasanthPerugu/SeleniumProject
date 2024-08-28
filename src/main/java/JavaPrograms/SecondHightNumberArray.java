package JavaPrograms;

public class SecondHightNumberArray {
	
	public static int findSecondHighest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        return secondMax;
	}
	public static void main(String[] args) {
		
		int[] array = {10, 20, 5, 15, 25}; // Sample array

        int secondHighest = findSecondHighest(array);
        System.out.println("Second highest number in the array is: " + secondHighest);
	}

}
