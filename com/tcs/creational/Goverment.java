package com.tcs.creational;

class Goverment {
	public static void main(String[] args) {
		RBI rbi = RBI.getInstance();
		RBI rbi1 = RBI.getInstance();
		System.out.println(rbi == rbi1);
	}
}
