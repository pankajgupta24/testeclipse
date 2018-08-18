package list;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericInArrayList {
	
	public static void main(String[] args) {
		
		ArrayList <String> obj= new ArrayList<String>();
		obj.add("India");
		obj.add("USA");
		obj.add("Singapore");
		obj.add("Uruguay");
		
		for (String v:obj){
			
			System.out.println(v);
			
			WebDriver driver=new ChromeDriver();
			driver.findElements(By.xpath(""));
			Select sel= new Select(driver.findElement(By.xpath("")));
			sel.getOptions();
		}
		
		
		
	}

}
