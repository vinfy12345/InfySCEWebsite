import static org.junit.Assert.*;

import org.junit.Test;

public class SquareNumberJunitTestCase {

	@Test
	public void test() {
		long num;
		TestMethodDefs ts=new TestMethodDefs();
		num=ts.square(25);
		System.out.println("Square of the number ="+num);
		//Checking for equality
		assertEquals(625, num);

	}

}
