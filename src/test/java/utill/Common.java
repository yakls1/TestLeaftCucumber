package utill;


import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Common {

	public static void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public static void handle1(WebDriver driver, List<String> list) { //handels Windows
		Set<String> hendles = driver.getWindowHandles();
		for (String hendle : hendles) {
			list.add(hendle);

		}
	}

}
