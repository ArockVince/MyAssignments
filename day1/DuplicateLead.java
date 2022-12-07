package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("DemoCSR");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Arockia");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Nancy");
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("A P");
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("ECE");
		 driver.findElement(By.id("createLeadForm_description")).sendKeys("Electronics");
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("arockianancy91@gmail.com");
		 driver.findElement(By.className("smallSubmit")).click();
		 System.out.println(driver.getTitle());
		 driver.findElement(By.linkText("Duplicate Lead")).click();
		 WebElement companyNameFieldChange=driver.findElement(By.id("createLeadForm_companyName"));
		 companyNameFieldChange.sendKeys("Testleaf");
		 companyNameFieldChange.clear();
		 companyNameFieldChange.sendKeys("NewTestleaf");
		 WebElement firstNemeFieldChange=driver.findElement(By.id("createLeadForm_firstName"));
		 firstNemeFieldChange.sendKeys("Arockia");
		 firstNemeFieldChange.clear();
		 firstNemeFieldChange.sendKeys("Vince");
		 driver.findElement(By.className("smallSubmit")).click();
	}
}
		 