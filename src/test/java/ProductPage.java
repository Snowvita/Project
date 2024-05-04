import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private final WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addProduct(String productId, String productName, String quantity, String price, String expiryDate, String supplierId) {
        driver.findElement(By.name("prodid")).sendKeys(productId);
        driver.findElement(By.name("prodname")).sendKeys(productName);
        driver.findElement(By.name("prodqty")).sendKeys(quantity);
        driver.findElement(By.name("prodprice")).sendKeys(price);
        driver.findElement(By.name("prodexp")).sendKeys(expiryDate);
        driver.findElement(By.name("supid")).sendKeys(supplierId);
        driver.findElement(By.id("productadd")).click();
    }

    public void editProductQuantity(String newQuantity) {
        driver.findElement(By.className("edit-button")).click();
        driver.findElement(By.id("prodqty")).clear();
        driver.findElement(By.id("prodqty")).sendKeys(newQuantity);
        driver.findElement(By.className("button")).click();
    }

    public void deleteProduct() {
        driver.findElement(By.className("delete-button")).click();
    }

    public void navigateBackToHomePage() {
        driver.findElement(By.id("backbutton")).click();
    }
}
