package com.vservice.eureka;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by yitao on 2019/1/24.
 */
@Component
@ConfigurationProperties
public class EnvConfig {

    private String env;

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }
}
