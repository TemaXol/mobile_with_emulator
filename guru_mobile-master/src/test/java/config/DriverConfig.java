package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${devicehost}.properties"
})
public interface DriverConfig extends Config {

    @Key("base.url")
    String getBaseUrl();

    @Key("localHost")
    @DefaultValue("http://localhost:4723/wd/hub")
    String getLocalHost();

    @Key("device.name")
    String getDevice();

    @Key("device.version")
    String getOsVersion();

    @Key("key")
    String getKey();

    @Key("user")
    String getUser();

    @Key("app")
    String getApp();

    @Key("project")
    String getProject();

    @Key("build")
    String getBuild();

    @Key("name")
    String getName();

    @Key("appPath")
    String getAppPath();

    @Key("appPackage")
    String getAppPackage();

    @Key("appActivity")
    String getAppActivity();

    @Key("deviceUrl")
    String getDeviceUrl();

    @Key("platformName")
    String getPlatformName();

    @Key("platformVersion")
    String getPlatformVersion();
}
