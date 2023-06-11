package learn_selenium;

public enum Browser {

    CHROME("chrome"),
    FIREFOX("firefox"),
    EDGE("edge"),
    SAFARI("safari");

    public final String BROWSER;

    Browser(String browser) {
        this.BROWSER = browser;
    }

}
