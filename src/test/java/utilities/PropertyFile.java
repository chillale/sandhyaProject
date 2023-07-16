package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
	public String readDataFromPropertyFile(String key) throws IOException {
		FileInputStream file = new FileInputStream("./PropertyFile.properties");
		Properties prop = new Properties();
		prop.load(file);
		return prop.getProperty(key);
		
	}
public static void main(String[] args) throws IOException {
	PropertyFile propp = new PropertyFile();
	String Url=propp.readDataFromPropertyFile("url");
	System.out.println(Url);
}
}
