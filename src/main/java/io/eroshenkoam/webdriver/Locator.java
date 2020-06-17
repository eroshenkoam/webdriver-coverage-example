package io.eroshenkoam.webdriver;

import java.util.HashSet;
import java.util.Set;

public class Locator {

    private String type;
    private String fullPath;
    private Set<String> urls = new HashSet<>();

    public String getType() {
        return type;
    }

    public Locator setType(String type) {
        this.type = type;
        return this;
    }

    public String getFullPath() {
        return fullPath;
    }

    public Locator setFullPath(String fullPath) {
        this.fullPath = fullPath;
        return this;
    }

    public Set<String> getUrls() {
        return urls;
    }

    public Locator setUrls(Set<String> urls) {
        this.urls = urls;
        return this;
    }

}
