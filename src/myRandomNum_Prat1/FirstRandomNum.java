package myRandomNum_Prat1;

import java.util.Random;

public class FirstRandomNum {

	public static void main(String[] args) {
		
		Random rnum = new Random();
		int num;
		int [] number = new int [500];
		int max  = number [0];
		int min = number [0];
		
		
		for (num = 1; num< 500; num ++) {
			number [num] = rnum.nextInt(1000);
			max = Math.max(max, number [num]);
			min = Math.min(min, number [num]);
			
		System.out.println(min);	
		}
		
		
		
		

	}

}
