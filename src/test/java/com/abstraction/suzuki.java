package com.abstraction;

public class suzuki extends Car {
	
	@Override
	void steering() {
		System.out.println("Steering is round");
	}
	
	public static void main(String[] args) {
		suzuki s = new suzuki();
		s.company();
		s.colour();
		s.steering();
	}

	
	

}
