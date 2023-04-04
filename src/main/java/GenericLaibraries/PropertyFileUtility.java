package GenericLaibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * This class contains reuseable methods for the actions performed on Properties file
 * @author shaash
 *
 */
public class PropertyFileUtility
{
	private Properties property;
	/**
	 * This method is used to intialize the Properties file
	 * @param filePath
	 */
	public void propertyConfig(String filePath)
	{
		FileInputStream fis = null;
		try
		{
			 fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
		
		Properties property = new Properties();
		try 
		{
			property.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * This method is used to fecth the valve from Properties file based on key
	 * @param key
	 * @return
	 */
		public String fetchProperty(String key)
		{
		return property.getProperty(key);
	    }
		
		/**
		 * This method is used to write data into properties file
		 * @param key
		 * @param valve
		 * @param filePath
		 * @param message
		 */
		public void setDataToProperties(String key,String valve,String filePath,String message) {
			property.put(key,valve);
			
			try {
				property.store(new FileOutputStream(filePath),message);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
}
