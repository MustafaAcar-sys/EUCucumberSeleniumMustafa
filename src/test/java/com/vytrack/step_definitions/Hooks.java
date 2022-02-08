package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp (){
        System.out.println("This is from before");
    }

    @After
    public void tearDown() {
        Driver.closeDriver();
    }
}
