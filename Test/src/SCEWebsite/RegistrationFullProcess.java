package SCEWebsite;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class RegistrationFullProcess extends SuiteBaseSCE {

	@BeforeClass
	public static void openBrowser() throws Exception {
		init();	
		logger.info("Browser Opened");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
		//hellooo
	}

}
