public static void main(String[] args) throws InterruptedException{

System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
WebDriver driver = new EdgeDriver();

String baseUrl = "https://www.bing.com/";
driver.get(baseUrl);

Set<Cookie> cookies = driver.manage().getCookies();
for(Cookie ck:cookies){
	System.out.println(ck);
}

driver.manage().deleteAllCookies();

System.out.println(driver.manage().getCookies());
