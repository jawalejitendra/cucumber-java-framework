package shareddata;

//import io.cucumber.guice.ScenarioScoped;

import cucumber.runtime.java.guice.ScenarioScoped;

@ScenarioScoped
public class DataContext {
    public int num1;
    public int num2;
    public int result;
}
