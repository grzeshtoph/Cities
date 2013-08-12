package com.springinaction.properties;

import com.google.common.base.Objects;

import java.util.Properties;

/**
 * Bean containing various properties-related information.
 */
public class PropertiesBean {
    private Properties settings;
    private String accessToken;
    private String myProp1;
    private String myProp2;
    private String myProp3;
    private String javaHome;
    private String osName;
    private String defaultSeparator;

    public Properties getSettings() {
        return settings;
    }

    public void setSettings(Properties settings) {
        this.settings = settings;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getMyProp1() {
        return myProp1;
    }

    public void setMyProp1(String myProp1) {
        this.myProp1 = myProp1;
    }

    public String getMyProp2() {
        return myProp2;
    }

    public void setMyProp2(String myProp2) {
        this.myProp2 = myProp2;
    }

    public String getMyProp3() {
        return myProp3;
    }

    public void setMyProp3(String myProp3) {
        this.myProp3 = myProp3;
    }

    public String getJavaHome() {
        return javaHome;
    }

    public void setJavaHome(String javaHome) {
        this.javaHome = javaHome;
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public String getDefaultSeparator() {
        return defaultSeparator;
    }

    public void setDefaultSeparator(String defaultSeparator) {
        this.defaultSeparator = defaultSeparator;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("settings", settings)
                .add("accessToken", accessToken)
                .add("myProp1", myProp1)
                .add("myProp2", myProp2)
                .add("myProp3", myProp3)
                .add("javaHome", javaHome)
                .add("osName", osName)
                .add("defaultSeparator", defaultSeparator)
                .toString();
    }
}
