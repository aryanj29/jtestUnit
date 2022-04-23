package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddNumbers {

	@Test
	public void test() 
	{
		jUnitFunctions junit= new jUnitFunctions();
		int out=junit.addNumbers(100, 200);
		assertEquals (300, out);
		
	}

}
