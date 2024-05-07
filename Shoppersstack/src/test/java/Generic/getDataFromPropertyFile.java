package Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class getDataFromPropertyFile implements Framework_Constants {
	
	public static String getData(String key) throws IOException
	{
		FileInputStream fis= new FileInputStream(property_path);
		Properties prop= new Properties();
		prop.load(fis);
		 String value = prop.getProperty(key);
		 return value;
	}
	
	public static String getVoucherData(String key2) throws IOException
	{
		FileInputStream fis= new FileInputStream(Voucher_path);
		Properties prop1= new Properties();
		prop1.load(fis);
		String voucher_data = prop1.getProperty(key2);
		return voucher_data;	
	}

}
