package com.kael.mall.common.util;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author kael
 * @Description
 * @Date 2020/8/20 0020
 */
@ConfigurationProperties(prefix = "secure.ignored")
public class IgnoreUrls {
    private List<String> urls = new ArrayList<>();

    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }
}
