/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.futureday.java_design_patterns.builder;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author FilipeSoares
 */

//The builder that builds the User by implementing the interface UserDTOBuilder
public class UserWebDTOBuilder implements UserDTOBuilder{

    
    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private UserWebDTO dto; 
    
    @Override
    public UserDTOBuilder withFirstName(String fname) {
        firstName = fname;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lname) {
        lastName = lname;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthday(LocalDate date) {
        Period ageInYears = Period.between(date, LocalDate.now());
        age = String.valueOf(ageInYears.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        
        this.address = address.getHouseNumber() + ", "+ address.getStreet()
                +"\n"+ address.getCity() + "\n"+ address.getState() + " "+ address.getZipCode();
        
        
        return this;
    }

    @Override
    public UserDTO build() {
        dto = new UserWebDTO(age, address, age);
        return dto;
    }

    @Override
    public UserDTO getUserDTO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
