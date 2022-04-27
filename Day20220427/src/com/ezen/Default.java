package com.ezen;

public class Default {

	public static void main(String[] args) {
		
	}

}

class Sae {
	int a;
	int b;
	
	public Sae() {
		super();
	}
	
}

class SaeCom extends Sae {
	int c;
	
	public SaeCom() {
		super();
		super.a = 5;
		this.c = 7;
	}
}
