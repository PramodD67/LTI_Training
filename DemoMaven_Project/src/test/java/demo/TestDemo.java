package demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDemo {

	@Test
	
	public void strcheck() {
		String s1="Demo1";
		System.out.println("This is a testcase for string check");
		assertEquals("Demo1",s1);
	}
}
