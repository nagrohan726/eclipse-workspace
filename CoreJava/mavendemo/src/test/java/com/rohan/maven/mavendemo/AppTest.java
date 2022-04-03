package com.rohan.maven.mavendemo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	/**
	 * Rigorous Test :-)
	 */
//    @Test
//    public void shouldAnswerWithTrue()
//    {
//        assertTrue( true );
//    }

	@Test
	public void givenANameWhenHelloThenReturnHelloName() {
		App app = new App();
		String result = app.hello("Rohan");
		Assert.assertNotNull(result);
		Assert.assertEquals("Hello Rohan", result);
	}
}
