package JavaPrograms;

import java.util.stream.IntStream;

public class PrintoneToHundredwithoutusingLoop {

	public static void main(String[] args) {
		//printNum(1);
		IntStream.range(1, 101).forEach(e->System.out.println(e));

	}
	
	public static void printNum(int num) {
		if(num<=100) {
		System.out.println(num);
			num++;
			printNum(num);
		}
	}
	}
