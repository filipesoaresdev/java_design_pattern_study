package com.futureday.java_design_patterns.builder2;

import com.futureday.java_design_patterns.builder.Address;
import com.futureday.java_design_patterns.builder.User;
import java.time.LocalDate;

/**
 *
 * @author FilipeSoares-STI
 */
public class Client {
    public static void main(String[] args) {
        
        UserDTO dto = directBuild(UserDTO.getBuilder(), createUser());
        System.out.println(dto);
        
    }
    
    private static UserDTO directBuild(UserDTO.UserDTOBuilder builder, User user){
        
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
