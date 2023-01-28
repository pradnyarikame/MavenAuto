package Com.Ecommerce.Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfiguration {
	
	Properties pro;
	public ReadConfiguration() {
		File src=new File("D:\\Softwares\\Eclipse\\Maven_automation\\src\\main\\java\\Com\\Ecommerce\\Configuration\\Config.properties");
		
		FileInputStream fis;
		try {
			fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
		
		public String getApplicationURL() {
			String url=pro.getProperty("baseURL");
			return url;
		}
		public String getusername() {
			String username1=pro.getProperty("username");
			return username1;
		}
		public String getpassword() {
			String password1=pro.getProperty("password");
			return password1;
		}
		public String getchromepath() {
			String Chromepath=pro.getProperty("chromepath");
			return Chromepath;
		}
//		public String geckdriver() {
//			String FireFox=pro.getProperty("firefox");
//			return FireFox;
//		}
//		public String edgedriver() {
//			String MsEdge=pro.getProperty("msedge");
//			return MsEdge;
//		}
//		public String internetExdriver() {
//			String IntEx=pro.getProperty("intexplore");
//			return IntEx;
		//}
	}


