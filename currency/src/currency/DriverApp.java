package currency;

import java.util.Arrays;
import java.util.Scanner;

public class DriverApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of currency notes: ");
		int size = sc.nextInt();
		int currency[ ] = new int[size];
		
		for(int i = 0; i<size; i++) {
			System.out.println("Please enter the denomination of currency notes: ");
			currency[i] = sc.nextInt();
		}
		System.out.println("Before sorting"+ Arrays.toString(currency));
		MergeSort mc = new MergeSort();
		mc.sort(currency, 0, size-1);
		System.out.println("After sorting"+Arrays.toString(currency));
		
		
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		
		NoteCount nc = new NoteCount();
		nc.counting(currency,amount);
		
		

	}

}
