package DifferentPagesApplication;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage
{
    private WebDriver driver;

    // Locator for the product title
    private By productTitle = By.className("title");

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to verify product page title
    public String getProductTitle() {
        return driver.findElement(productTitle).getText();
    }
}

