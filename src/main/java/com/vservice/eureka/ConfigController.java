package com.vservice.eureka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yitao on 2019/1/24.
 */
@RestController
@RequestMapping("/config")
public class ConfigController {

    @Autowired
    private EnvConfig envConfig;

    @RequestMapping("/env")
    public String env() {
        return envConfig.getEnv();
    }

}
