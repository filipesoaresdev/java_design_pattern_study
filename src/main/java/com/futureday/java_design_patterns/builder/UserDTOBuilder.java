package com.futureday.java_design_patterns.builder;


//An abstract builder
import java.time.LocalDate;

/**
 *
 * @author FilipeSoares-STI
 */
public interface UserDTOBuilder {
    
    
    //These methods build the parts of the User
    UserDTOBuilder withFirstName(String fname);
    UserDTOBuilder withLastName(String lname);
    UserDTOBuilder withBirthday(LocalDate date);
    UserDTOBuilder withAddress(Address address);
    
    //Method to build the final product
    UserDTO build();
    
    
    UserDTO getUserDTO();
    
}
