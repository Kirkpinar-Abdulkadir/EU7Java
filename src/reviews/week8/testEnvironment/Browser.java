package reviews.week8.testEnvironment;

public class Browser {

    private  String browserType;

    public Browser(){

    }
    public Browser(String name){
        browserType = name;
    }
    public String toString() {
        return "Browser{" +
                "browserType='" + browserType + '\'' +
                '}';
    }
    public String getBrowserType() {
        return browserType;
    }
    public void setBrowserType(String browserType) {
        this.browserType = browserType;
    }
}
