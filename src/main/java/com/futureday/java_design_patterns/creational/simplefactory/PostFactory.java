/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.futureday.java_design_patterns.creational.simplefactory;

/**
 *
 * @author FilipeSoares-STI
 */

//Simple Factory
public class PostFactory {
    
    static final String BLOG = "blog";
    static final String NEWS = "news";
    static final String PRODUCT = "product";
    
    public static Post createPost(String type){
        
        switch(type){
            case BLOG:
                return new BlogPost();
            case NEWS:
                return new NewsPost();
            case PRODUCT:
                return new ProductPost();
            default:
                throw new IllegalArgumentException("Post type is unknow");
        }
    }
}
