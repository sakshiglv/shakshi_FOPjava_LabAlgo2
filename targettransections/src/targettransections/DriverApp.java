package targettransections;

import java.util.Arrays;
import java.util.Scanner;

public class DriverApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of array: ");
		int size = sc.nextInt();
		int trans[] = new int[size];
		
		for(int i = 0; i<trans.length; i++) {
			System.out.printf("Please enter the income of day %d ",i+1);
			trans[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(trans));
		System.out.println("Please enter the number of targets: ");
		int targets = sc.nextInt();
		
		int sum = 0;
		
		
		for(int j = 1; j<=targets; j++) {
			System.out.printf("Pleanse enter the value of target %d: ",j);
			int target = sc.nextInt();
			sum = 0;
			
			for(int k = 0 ; k<trans.length; k++) {
				sum+=trans[k];
				if(sum>=target) {
					System.out.printf("Given target achieved after %d transections",k+1);
					break;
				}if(k == (trans.length-1)&& sum<target) {
					System.out.println("Given target is not achieved ");
				}
			}
		}
			
		
		
	     

	}

}
