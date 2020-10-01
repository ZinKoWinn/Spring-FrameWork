package com.spring.day9.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean {
    @Value("${app.find.property}")
    private String appFileProperty;
    @Value("${app.vm.property}")
    private  String appVmProperty;
    @Value("${app.env.property}")
    private String appEnvProperty;
    @Value("${user.home}")
    private String userHome;
    @Value("${JAVA_HOME}")
    private String javaHome;

    public String getAppFileProperty() {
        return appFileProperty;
    }

    public String getAppVmProperty() {
        return appVmProperty;
    }

    public String getAppEnvProperty() {
        return appEnvProperty;
    }

    public String getUserHome() {
        return userHome;
    }

    public String getJavaHome() {
        return javaHome;
    }

    public String getMavenHome() {
        return mavenHome;
    }

    @Value("${MAVEN_HOME}")
    private String mavenHome;
}
