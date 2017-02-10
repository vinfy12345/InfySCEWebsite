package JenkinsTrial;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SuiteBase {

	
	public static Properties prop = new Properties();
	public static InputStream input = null;
	public static void init() throws IOException{
		input = new FileInputStream(System.getProperty("user.dir")+"\\src\\TestDataSCE\\XpathConfig.properties");
		
	}
}
