package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddStrings {

	@Test
	public void test()
	{
		jUnitFunctions junitstring= new jUnitFunctions();
		String out=junitstring.addStrings("capstone","project");
		assertEquals("capstoneproject", out);
		
	}

}
