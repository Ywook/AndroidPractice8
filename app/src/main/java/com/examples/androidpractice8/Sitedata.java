package com.examples.androidpractice8;

/**
 * Created by Mac on 2017. 5. 4..
 */

public class Sitedata {
    private String url;
    private String title;

    public Sitedata(String url, String title) {
        this.url = url;
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "<" + title + ">" + " " + url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
