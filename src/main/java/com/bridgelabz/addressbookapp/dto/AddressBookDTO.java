package com.bridgelabz.addressbookapp.dto;

public class AddressBookDTO {

    public String firstName;
    public String lastName;
    public String address;
    public String city;
    public String state;
    public String emailId;
    public long phoneNumber;
    public int zipCode;

    public AddressBookDTO(String firstName, String lastName, String address,
                          String city, String state, String emailId,
                          long phoneNumber, int zipCode) {

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
        return "AddressBookDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", emailId='" + emailId + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", zipCode=" + zipCode +
                '}';
    }
}
