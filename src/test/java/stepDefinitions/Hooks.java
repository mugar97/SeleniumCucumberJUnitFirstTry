package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.driver.DriverManager;

public class Hooks {
    
    DriverManager driverManager;
    
    public Hooks(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Before
    public void setUp(){
        driverManager.init();
    }

    @After
    public void tearDown(){
        driverManager.quit();
    }
}
