package Classes;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class New_Classes {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "D:\\EdgeDriver\\msedgedriver.exe");
//		WebDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
		driver.get(
				"file:///C:/Users/ASUS/Desktop/QA_GetSecrenShot/Qa-automation-7thmar/Qa-automation-7thmar/index.html");
//		Date currentDate = new Date () ;
//		String TheAcutalDate = currentDate.toString().replace(":", "-");
//		System.out.println(currentDate);
//;		TakesScreenshot Src = ((TakesScreenshot)driver );
//		File SrcFile = Src.getScreenshotAs((OutputType.FILE));
//		File Dest = new File("./mypictures/"+TheAcutalDate+".png");
//		
//		FileUtils.copyFile (SrcFile,Dest);
		// I need to remove three item ----

		List<WebElement> TheStudents = driver.findElements(By.tagName("option"));
		System.out.println(TheStudents.size());
//		int howManyItems = 3;
//		for(int i=0; i< howManyItems;i++) 
//		{
//			driver.findElement(By.xpath("//*[@id=\"remove\"]")).click();
//		}
//		
		// I need to remove five item ----

//		int howManyItems = 5;
//		for(int i=0; i< TheStudents.size();i++) 
//		{
//			driver.findElement(By.xpath("//*[@id=\"remove\"]")).click();
//		}
		int theTotalNumberofStudents = TheStudents.size();
		System.out.println(theTotalNumberofStudents + "this the original number");
		int howManyItems = 1;
		System.out.println(howManyItems + "this the number of item i want remove");

		for (int i = 0; i < howManyItems; i++) {
			driver.findElement(By.xpath("//*[@id=\"remove\"]")).click();
		}
		List <WebElement> thestudentsafterremove = driver.findElements(By.tagName("option"));
		int ActualNumber = thestudentsafterremove.size();
		System.out.println(ActualNumber + "this is the new actual number");
		int expextedItems = theTotalNumberofStudents - howManyItems;
		System.out.println(expextedItems + "this is the number i have expected");
		Assert.assertEquals(ActualNumber, expextedItems);

	}

}
