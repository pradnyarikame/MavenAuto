package Com.Ecommerce.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Com.Ecommerce.PageClass.TC_Ecommerce_Login_Page;
import Com.Ecommerce.TestClass.Ecommerce_BaseClass;
import Com.Ecommerce.Utilities.XLUtils;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class TC_LoginDataTestCase  extends Ecommerce_BaseClass {
	@Test(dataProvider="LoginData")
	
	public void LoginData(String username,String pass,String Expected) {
		logger.info("Open URL");
		TC_Ecommerce_Login_Page TEL=new TC_Ecommerce_Login_Page();
		
		TEL.SetUsername(username);
		logger.info("enter username");
		TEL.SetPassword(pass);
		logger.info("Enter user password");
		TEL.ClickButton();
		logger.info("Click on login button");
		
		String ActualResult=driver.getTitle();
		String ExpectedResult="nopCommerce demo store";
		
		if(Expected.equals("valid")) {
			if(ActualResult.equals(ExpectedResult)) {
				//TEL.Logout();
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false);
			}
		}
		else if(Expected.equals("invalid")) {
			if(ExpectedResult.equals(ActualResult)) {
				//TEL.Logout();
				Assert.assertTrue(false);
			}
			else {
				Assert.assertTrue(true);
			}
		}
	}
	@DataProvider(name="LoginData")
	public String[][]getdata() throws IOException{
		String path=System.getProperty("user.dir")+"D:\\Softwares\\Eclipse\\Maven_automation\\src\\main\\java\\Com\\Ecommerce\\TestData\\ExWithDDF.xlsx";
		
		int rownum=XLUtils.getRowCount(path,"sheet1");
		int colcount=XLUtils.getCellcount(path,"sheet1",1);
		
		String logindata[][]=new String[rownum][colcount];
		for(int i=1;i<=rownum;i++) {
			for(int j=0;j<colcount;j++) {
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j);
			}
		}
		return logindata;
		
		
	}

}
