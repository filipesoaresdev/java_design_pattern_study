/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.futureday.java_design_patterns.simplefactory;

import java.time.LocalDate;

/**
 *
 * @author FilipeSoares-STI
 */
public class NewsPost extends Post{
    
    
    private String headline;
    private LocalDate newsTime;

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public LocalDate getNewsTime() {
        return newsTime;
    }

    public void setNewsTime(LocalDate newsTime) {
        this.newsTime = newsTime;
    }
    
    
}
