package com.cc150.list;


public class AddNumbersFromList_2_5 {
	public int add(Node h1, Node h2){
		int sum = 0, carry = 0;
		Node c1 = h1, c2 = h2;
		int prop = 1;
		while(c1 != null && c2 != null){			
			if(carry + c1.value + c2.value >= 10){			
				sum +=  prop * (carry + c1.value + c2.value - 10);
				carry = 1;
			} else {
				sum +=  prop * (carry + c1.value + c2.value);
				carry = 0;
			}
			prop *= 10;
			c1 = c1.right;
			c2 = c2.right;
		}
		Node c = c1 == null ? c2 : c1;
		while(c != null){
			if(carry + c.value >= 10){			
				sum +=  prop * (carry + c.value - 10);
				carry = 1;
			} else {
				sum +=  prop * (carry + c.value);
				carry = 0;
			}
			prop *= 10;
			c = c.right;
		}
		if(carry != 0)
			sum += carry * prop;
		
		return sum;
	}
}
