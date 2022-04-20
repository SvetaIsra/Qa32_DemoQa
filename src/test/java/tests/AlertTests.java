package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertTests extends TestBase{

    @BeforeMethod
    public void preConditions(){
        app.alert().selectItemAlert();
        app.alert().selectAlerts();

    }

    @Test
    public void test(){

    }

}
