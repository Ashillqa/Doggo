package main;

import java.util.ArrayList;
import java.util.List;

public class Doggo{
	
	public void Position(int position) {
		
	String[] digits = {"","1st","2nd","3rd","4th","5th","6th","7th","8th","9th","10th","11th","12th","13th","14th","15th","16th","17th","18th","19th"};	
	String [] tens = {"","","2","3","4","5","6","7","8","9"};
	
	List<String> l1 = new ArrayList<>();
	
	for(int n=1;n<=100;n++) {
	if(n<20) {
		l1.add(digits[n]);
	}else if (n>99) {
		l1.add("100th");
	}else if (n>=20 && n%10==0) {
		l1.add(tens[n/10].concat("0th"));
	}else {
		l1.add(tens[n/10].concat(digits[n%10]));
	}
		
}
	l1.remove(position-1);
	l1.add(position-1, "");
	System.out.println(l1);
	
	
	
}
}
																		
		
		
		
		
		
	
