import static org.junit.Assert.*;

import org.junit.Test;

public class CountAString {

	@Test
	public void test() {
		TestMethodDefs ts=new TestMethodDefs();
		int count=0;
		count=ts.CountAString("Alaphabet");
		System.out.println("The number of A's in the given string are "+count);
		assertEquals(3, count);
		
		
	}

}
