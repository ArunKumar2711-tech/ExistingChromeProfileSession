package checking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UseChromeProfile {
    public static void main(String[] args) {
        
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
        
        String userDataDir = "C:\\Users\\darunkumar\\AppData\\Local\\Google\\Chrome\\User Data\\Default";
        
        
        options.addArguments("user-data-dir=" + userDataDir);
        
                WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.fb.com");
        System.out.println(driver.getTitle());

        
    }
}
