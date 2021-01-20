package com.bridgelabz.addressbookapp.dto;

import javax.validation.constraints.Pattern;

public class AddressBookDTO {

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\\\s]{2,}$", message = "Invalid First Name")
    public String firstName;
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\\\s]{2,}$", message = "Invalid Last Name")
    public String lastName;
    public String address;
    public String city;
    public String state;
    @Pattern(regexp = "^(?!.*@.*@)[abc]+([.+-_][0-9a-zA-Z]+)*@[0-9a-zA-Z]+[.][a-zA-Z]{2,4}[.]{0,1}([a-zA-Z]{0,3})$", message = "Invalid Email ID ")
    public String emailId;
    @Pattern(regexp = "[91]{2}\\\\s{1}[789][0-9]{9}", message = "Invalid Mobile Number")
    public String phoneNumber;
    public int zipCode;

    public AddressBookDTO(String firstName, String lastName, String address,
                          String city, String state, String emailId,
                          String phoneNumber, int zipCode) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", emailId='" + emailId + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", zipCode=" + zipCode;
    }
}
