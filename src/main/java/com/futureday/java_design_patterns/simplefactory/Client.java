/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.futureday.java_design_patterns.simplefactory;

/**
 *
 * @author FilipeSoares-STI
 */
public class Client {
    
    public static void main(String[] args) {
        Post post = PostFactory.createPost("blog");
        System.out.println(post);
    }
    
}
