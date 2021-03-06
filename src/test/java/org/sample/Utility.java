package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.KeyManagerFactorySpi;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility {
	 static WebDriver driver;

	public static void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	public void launchUrl(String data) {
		driver.get(data);

	}

	public void enterText(WebElement e, String data) {
		e.sendKeys(data);

	}

	public void btnClick(WebElement e) {
		e.click();

	}

	public void getAtt(WebElement e, String data) {
		e.getAttribute(data);

	}

	public void getText(WebElement e) {
		e.getText();

	}

	public void moveToElement(WebElement e) {
		Actions ac = new Actions(driver);
		ac.moveToElement(e).perform();

	}

	public void dragAndDrop(WebElement e, WebElement e1) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(e, e1).perform();

	}

	public void doubleClick(WebElement e) {
		Actions ac = new Actions(driver);
		ac.doubleClick(e).perform();
	}

	public void rightClick(WebElement e) {
		Actions ac = new Actions(driver);
		ac.contextClick(e).perform();

	}
	public void robot() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	public void keyUpAndDown(WebElement e, String data) {
		Actions ac = new Actions(driver);
		ac.keyDown(e, Keys.SHIFT).sendKeys(e, data).keyUp(e, Keys.SHIFT).perform();

	}

	public void alerts(String data) {
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	public void alerts1(String data) {
		Alert a = driver.switchTo().alert();
		a.dismiss();
}
	public void alerts2(String data) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(data);

	}

	public void jSText(String data, WebElement e) {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].setAttribute('value','" + data + "')", e);

	}

	public void jsClick(WebElement e) {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click()", e);
	}

	public void jSGetAtt(String data, WebElement e) {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].getAttribute('value','" + data + "')", e);
	}

	public void jSScrollDown(String data, WebElement e) {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView(true)", e);

	}

	public void jSScrollUp(String data, WebElement e) {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView(false)", e);
	}

	public void selectByIndex(WebElement e, int number) {
		Select s = new Select(e);
		s.selectByIndex(number);

	}

	public void selectByValue(WebElement e, String data) {
		Select s = new Select(e);
		s.selectByValue(data);
	}

	public void selectByVisible(WebElement e, String data) {
		Select s = new Select(e);
		s.selectByVisibleText(data);
	}

	public void deselectByIndex(WebElement e, int number) {
		Select s = new Select(e);
		s.deselectByIndex(number);

	}

	public void deSelectByValue(WebElement e, String data) {
		Select s = new Select(e);
		s.deselectByValue(data);
	}

	public void deselectByVisible(WebElement e, String data) {
		Select s = new Select(e);
		s.deselectByVisibleText(data);
	}

	// 24
	public void getOptionBySelect(WebElement e) {
		Select s = new Select(e);
		s.getOptions();
	}

	// 25
	public void getAllSelect(WebElement e) {
		Select s = new Select(e);
		s.getAllSelectedOptions();

	}
	//26
	public void getFirstSelect(WebElement e) {
		Select s = new Select(e);
		s.getFirstSelectedOption();

	}
	//27
	public void isMultiple(WebElement e) {
		Select s = new Select(e);
		s.isMultiple();

	}
	//28
	public void deselectALL(WebElement e) {
		Select s = new Select(e);
		s.deselectAll();

	}
	//29
	public void getSize(WebElement e) {
		e.getSize();

	}
	//30
  public void frames(int number,String data,WebElement e) {
	driver.switchTo().frame(number);
  }
  public void frames1(int number,String data,WebElement e) {
	driver.switchTo().frame(data);
}
  public void frames2(int number,String data,WebElement e) {
	driver.switchTo().frame(e);
	}
  public void frames3(int number,String data,WebElement e) {
	driver.switchTo().parentFrame();
	}
  public void frames4(int number,String data,WebElement e) {
	driver.switchTo().defaultContent();
	
  }
	//31
  public WebElement findElement(String data) {
	WebElement findElement = driver.findElement(By.id(data));
	return findElement;
  }
  public WebElement findElementXpath(String data) {
	WebElement findElement = driver.findElement(By.xpath(data));
	return findElement;
  }
  public void findElementTagName(String data) {
	driver.findElement(By.tagName(data));
  }
  public WebElement findElementName(String data) {
	WebElement findElement = driver.findElement(By.name(data));
	return findElement;
}
  //32
  public void findElements(String data) {
	  driver.findElements(By.tagName(data));
	
}
  public void findElements1(String data) {
	  driver.findElements(By.id(data));
	
}
  public void findElements2(String data) {
	  driver.findElements(By.name(data));
	
}
  public void findElements3(String data) {
	  driver.findElements(By.xpath(data));
	
}
  //33
  public void screenShot() {
	  TakesScreenshot s = (TakesScreenshot) driver;
	  s.getScreenshotAs(OutputType.FILE);
	
}
  //34
  public void windowsHandling(String data) {
	driver.switchTo().window(data);
}
  public void windowsHandling1(String data) {
  driver.getWindowHandle();
  }
  public void windowsHandling2(String data) {
	driver.getWindowHandles();
  }
//35
  public void navigation(String data) {
driver.navigate().to(data);	
  }
  public void navigation1(String data) {
driver.navigate().forward();
  }
  public void navigation2(String data) {
driver.navigate().back();	
  }
  public void navigation3(String data) {
driver.navigate().refresh();	
}
  public void waits (TimeUnit data,int number) {
	driver.manage().timeouts().implicitlyWait(number, data);
}
   

 
  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
