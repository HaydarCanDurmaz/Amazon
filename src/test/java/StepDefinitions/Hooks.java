package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void Before(){
        System.out.println("start loading...");

    }
    @After
    public void After(){
        System.out.println("finish loading...");

    }

}
