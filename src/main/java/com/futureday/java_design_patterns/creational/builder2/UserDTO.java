package com.futureday.java_design_patterns.creational.builder2;

import com.futureday.java_design_patterns.creational.builder.Address;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author FilipeSoares-STI
 */
public class UserDTO {
    private String name;
    private String address;
    private String age;

    //No constructor

    public String getName() {
        return name;
    }

    //
    private void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    //Not accessible from outside the class (Immutability)
    private void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    private void setAge(String age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
		return "name=" + name + "\nage=" + age + "\naddress=" + address ;
    }
        
    public static UserDTOBuilder getBuilder(){
        return new UserDTOBuilder();
    }
      
    public static class UserDTOBuilder{
        private static String firstName;
        private static String lastName;
        private static String age;
        private static String address;
        private static UserDTO dto; 

        public UserDTOBuilder withFirstName(String fname) {
            firstName = fname;
            return this;
        }

        public UserDTOBuilder withLastName(String lname) {
            lastName = lname;
            return this;
        }

        public UserDTOBuilder withBirthday(LocalDate date) {
            Period ageInYears = Period.between(date, LocalDate.now());
            age = String.valueOf(ageInYears.getYears());
            return this;
        }

        public UserDTOBuilder withAddress(Address address) {

            this.address = address.getHouseNumber() + ", "+ address.getStreet()
                    +"\n"+ address.getCity() + "\n"+ address.getState() + " "+ address.getZipCode();


            return this;
        }

        public static UserDTO build() {
            dto = new UserDTO();
            dto.setName(firstName + " "+ lastName);
            dto.setAddress(address);
            dto.setAge(age);
            return dto;
        }

        public UserDTO getUserDTO() {
            return dto;
        }
    
    }
    
    
    
}
