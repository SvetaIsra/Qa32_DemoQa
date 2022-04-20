package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver wd;
    HelperAlert alert;
    HelperSelect select;
    HelperWindows windows;
    HelperJS js;

    public void init(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.navigate().to("https://demoqa.com/");

        alert = new HelperAlert(wd);
        select = new HelperSelect(wd);
        windows = new HelperWindows(wd);
        js = new HelperJS(wd);
    }
    public void stop(){
        //wd.quit();
    }

    public HelperAlert alert(){ return alert;}
    public HelperSelect select(){ return select;}
    public HelperWindows windows(){ return windows;}
    public HelperJS js(){ return js;}
}
