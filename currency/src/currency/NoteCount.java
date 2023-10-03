package currency;

import java.util.Arrays;

public class NoteCount {

	public void counting(int currency[],int amount) {
		int sum =  0;
		int note[] = new int[currency.length];
		for(int i = 0; i<currency.length; i++) {
			note[i] = amount/currency[i];
			sum = sum+note[i];
			amount = amount%currency[i];
			
		}System.out.println(Arrays.toString(note));
		System.out.println("Your payment approach in order to give minimum no of notes will be: ");
		
		for(int j = 0;j<note.length;j++) {
			System.out.println(currency[j]+"X"+note[j]);
		}
		
		
		
	}

}
