package com.immutable.example;

public class Immutable {
	public static void main(String[] args) {
		String number = "12345";
		String gString = number;
		System.out.println(gString);
		String fork = number.concat("54");
		System.out.println(fork);
		String ask = gString.concat(fork);
		gString = gString.concat(ask);
		fork = fork.concat(gString);
		System.out.println(number);
		System.out.println(gString);
		System.out.println(ask);
		System.out.println(fork);
	}
}
