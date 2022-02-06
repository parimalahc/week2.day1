package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestCompany001");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Parimala");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Pawankumar");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("09/07/91");

		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("1234");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("parimalapawankumar@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9884456565");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Parimala");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.abc.com");

		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Parimala");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Parimala");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("abcde street");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("ashok nagar north");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600126");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("97");

		Select select = new Select(driver.findElement(By.id("createLeadForm_generalCountryGeoId")));
		select.selectByVisibleText("India");

		Select select1 = new Select(driver.findElement(By.name("generalStateProvinceGeoId")));
		select1.selectByValue("IN-TN");

		driver.findElement(By.name("submitButton")).click();

	}

}
