package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) {
		try {
		File config = new File("..\\AmazonWebApp\\src\\main\\java\\utility\\config.properties");
		FileInputStream inStream = new FileInputStream(config);
		Properties prop = new Properties();
		
		prop.load(inStream);
		String url = prop.getProperty("url");
		System.out.println(url);
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
