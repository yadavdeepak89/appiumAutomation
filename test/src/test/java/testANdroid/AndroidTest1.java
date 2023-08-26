package testANdroid;


import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

import org.junit.Test;


import java.net.MalformedURLException;
import java.net.URL;
import org.junit.Test;

public class AndroidTest1 {

//	@Test
//	public void androidLaunchTest() throws MalformedURLException, InterruptedException {
////		System.getenv("ANDROID_HOME");
////		System.getenv("ANDROID_SDK_ROOT");
////		System.out.println(System.getenv("ANDROID_HOME"));
////		System.out.println(System.getenv("ANDROID_SDK_ROOT"));
//		UiAutomator2Options options = new UiAutomator2Options();
//		options.setPlatformName("Android");
//
//		options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
//		options.setDeviceName("xyz");
//		System.out.println(System.getProperty("user.dir") );
//		options.setApp(System.getProperty("user.dir") + "/src/test/resources/app/Android-MyDemoAppRN.1.3.0.build-244.apk");
//		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
//		Thread.sleep(4000);
//	}
	
	@Test
    public void iosLaunchTest() throws MalformedURLException, InterruptedException {
		System.out.println(System.getProperty("user.dir")+"/src/test/resources/app/iOS-Simulator-MyRNDemoApp.1.3.0-162.zip");
        XCUITestOptions options=new XCUITestOptions();
//        options.setPlatformName("iOS");
//        options.setCapability(MobileCapabilityType.PLATFORM_VERSION, "16.4");
//        options.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        options.setDeviceName("iPhone 14");
        options.setCapability("noReset", "true");
        options.setCapability("wdaStartupRetries", "4");
        options.setCapability("iosInstallPause","8000" );
        options.setCapability("wdaStartupRetryInterval", "20000");
//        options.setApp(System.getProperty("user.dir")+"/src/test/resources/app/iOS-Real-Device-MyRNDemoApp.1.3.0-162.ipa");
        options.setApp(System.getProperty("user.dir")+"/src/test/resources/app/iOS-Simulator-MyRNDemoApp.1.3.0-162.zip");
        IOSDriver driver=new IOSDriver(new URL("http://127.0.0.1:4723"),options);
        Thread.sleep(4000);
    }

}