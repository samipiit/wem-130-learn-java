package learn_selenium;

public enum Browser {

    CHROME("chrome"),
    FIREFOX("firefox"),
    EDGE("edge"),
    SAFARI("safari");

    public String browser;

    Browser(String browser) {
        this.browser = browser;
    }

}
