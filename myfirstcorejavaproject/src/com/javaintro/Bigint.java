package com.javaintro;

import java.math.BigInteger;
import java.math.BigDecimal;

public class Bigint {
	
	
	

	public static void main(String[] args) {
		
		BigInteger num1= new BigInteger("1234457");
		BigInteger num3= new BigInteger("1234457");

		BigDecimal num2 = new BigDecimal("1236545.45768");
		BigDecimal num5 = new BigDecimal("675367364.0926");
		
		System.out.println(num1.add(num3));
		System.out.println(num2.add(num5));
		
		System.out.println(num1.multiply(num3));
		System.out.println(num1.subtract(num3));
		System.out.println(num1.divide(num3));

	}

}

