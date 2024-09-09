package checking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class First {

    public static void main(String[] args) {
        // Get the path to the current working directory
        String path = System.getProperty("user.dir");
        
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", path + "/Drivers/chromedriver.exe");
        
        // Create a new instance of ChromeOptions
        ChromeOptions options = new ChromeOptions();
        options.setBinary(path+"/Drivers/chrome.exe");        
        // Optionally, you can add ChromeOptions here if needed (e.g., headless mode)
        // options.addArguments("--headless"); // Uncomment if you want to run Chrome in headless mode
        
        // Create a new instance of ChromeDriver with the specified options
        WebDriver driver = new ChromeDriver(options);
        
        try {
            // Navigate to Gmail
            driver.get("https://mail.google.com");
            
            // Optionally, you can add more code to interact with the page
        } finally {
            // Close the browser and clean up
            driver.quit();
        }
    }
}
