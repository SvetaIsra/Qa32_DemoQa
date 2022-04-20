package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperAlert extends HelperBase{
    public HelperAlert(WebDriver wd){ super(wd);}

    public void selectItemAlert(){
        hideFooter();
        hideAds();
        scroll(0, 300);
        click(By.xpath("//div/h5[.='Alerts, Frame & Windows']"));
    }

    public void selectAlerts(){
        hideAds();
        hideFooter();
        scroll(0, 300);
        click(By.xpath("//span[text()='Alerts']"));
    }
}
