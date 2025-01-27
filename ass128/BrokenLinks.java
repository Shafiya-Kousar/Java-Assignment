package ass128;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BrokenLinks extends LaunchChrome {

	static void validateinks(String link) throws IOException
	{
		try {
		URL u=new URL(link);
		HttpURLConnection h=(HttpURLConnection) u.openConnection();
		if(h.getResponseCode()==200 || h.getResponseCode()==201)
		{
			System.out.println("link is valid-->" +link+ " "+h.getResponseCode()+ " "+h.getResponseMessage());
		}
		else
		{
			System.out.println("link is invalid-->" +link+ " "+h.getResponseCode()+ " " +h.getResponseMessage());
		}
		}
		catch(MalformedURLException m)
		{
			System.out.println("i handled");
		}
	}
	@Test
	public void testing() throws IOException
	{
		
		List<WebElement> e=driver.findElements(By.tagName("a"));
		int count=e.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement links=e.get(i);
			//System.out.println(links);
			String s=links.getText();
			String s1=links.getAttribute("href");
			System.out.println(s);
			validateinks(s1);
		}
	}
}
