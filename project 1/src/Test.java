import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Test {

	public static void main(String[] args) throws IOException  {

		Properties properties = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\Users\phani\eclipse-workspace\project 1\src\test.properties");
		
		properties.load(fis);
		
		String value = properties.getProperty("phaniKey");
		System.out.println(value);
		
		System.out.println(properties);
		
		FileOutputStream fos = new FileOutputStream("C:\Users\phani\eclipse-workspace\project 1\src\test.properties");
		properties.setProperty("rakeshKey", "rakeshValue_updated");
		
		properties.store(fos, "This is updated by Rakesh.....");
		
		System.out.println("updated properties file Successfully.......");
		
	}
}