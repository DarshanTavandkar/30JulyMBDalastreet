package ai.ds.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import ai.ds.testBase.TestBase;



public class UitilClass extends TestBase {

	public UitilClass()
	{
		PageFactory.initElements(driver,this );
	}
	
	//screenshot
	
	public static void takeScreenShot(String filename) 
	{
	
		try {
			String path ="C:\\Users\\ACER\\Downloads\\30JulyMBDalalStrreet\\screenshot\\";
			TakesScreenshot Ts=(TakesScreenshot)driver;
			File src =Ts.getScreenshotAs(OutputType.FILE);
			
			File des = new File(path+filename+".png");
			FileHandler.copy(src, des);
		} 
		catch (IOException e)
		{
			System.out.println("IO Exception - file not found");
			e.printStackTrace();
		}
	
	}
	
	
	
	
	
}
