package org.samples;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.sample.Utility;

public class Intergeral extends Utility {
	public static void main(String[] args) throws AWTException {
		Utility u = new Utility();
		u.getDriver();
		u.launchUrl("http://greenstech.in/selenium-course-content.html");
		u.rightClick(u.findElement("home-tab"));
		u.robot();
		
		
	}

}

