package com.test;


import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.main1.PrimeNumbers;
@RunWith(Parameterized.class)
public class PrimeNumbersTest {
	PrimeNumbers pn;
	int input;
	Boolean expected;
	public  PrimeNumbersTest(int input,boolean expected) {
	
		this.input=input;
		this.expected=expected;
	}
	@Before
public void start(){
		pn=new PrimeNumbers();
}
	@Parameterized.Parameters
	public static Collection getData(){
		Object[][]data=new Object[][]{{2,true},{6,false},{7,true},{22,false}};
		return Arrays.asList(data);
}@Test
	public void validatePrimeNumbers(){
		boolean actual=pn.checkPrime(input);
		assertEquals(expected,actual);
	}
}