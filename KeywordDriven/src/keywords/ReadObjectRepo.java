package keywords;

import java.io.FileInputStream;
import java.util.Properties;


public class ReadObjectRepo {

	




		public static Properties prop;
		public static String filePath = "./webelement.properties";
		
		public static void getPropertiesInstance(String path){
			try{
				if(prop==null){
					prop=new Properties();
					prop.load(new FileInputStream(path));
					
				}
			}catch(Exception e){
				System.out.println(e.getStackTrace());
			}
		}
		
		public static String getProperty(String key){
			String returnVal = null;
			if(prop==null){
				getPropertiesInstance(filePath);
				
			}
			returnVal = prop.getProperty(key);
			return returnVal;
		}
	
	
	
}