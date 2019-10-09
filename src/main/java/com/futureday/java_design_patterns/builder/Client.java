/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.futureday.java_design_patterns.builder;

import java.time.LocalDate;

/**
 *
 * @author FilipeSoares-STI
 */
public class Client {
    
    
    public static void main(String[] args) {
        
        UserDTO dto = directBuild(new UserWebDTOBuilder(), createUser());
        System.out.println(dto);
        
    }
    
    private static UserDTO directBuild(UserDTOBuilder builder, User user){
        
        return builder.withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withBirthday(user.getBirthday())
                .withAddress(user.getAddress())
                .build();
        
    }
    
    
    public static User createUser(){
        
        User user = new User();
        user.setBirthday(LocalDate.of(1960, 5, 6));
        user.setFirstName("Filipe");
        user.setLastName("Viana");
        Address address = new Address();
        address.setHouseNumber("999");
        address.setStreet("Big one Street");
        address.setCity("Teresina");
        address.setState("Piaui");
        address.setZipCode("666000000");
        user.setAddress(address);
        return user;
        
    }
    
    
}
