package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "address_book")
public @Data class AddressBookData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "address_id")
    public int addressId;
    public String firstName;
    public String lastName;
    public String address;
    public String city;
    public String state;
    public String emailId;
    public String phoneNumber;
    public int zipCode;

    public AddressBookData() {
        
    }
    public AddressBookData(AddressBookDTO addressBookDTO) {
        this.updateAddressBookData(addressBookDTO);
    }

    public void updateAddressBookData(AddressBookDTO addressBookDTO) {
        this.firstName = addressBookDTO.firstName;
        this.lastName = addressBookDTO.lastName;
        this.address = addressBookDTO.address;
        this.city = addressBookDTO.city;
        this.state = addressBookDTO.state;
        this.emailId = addressBookDTO.emailId;
        this.phoneNumber = addressBookDTO.phoneNumber;
        this.zipCode = addressBookDTO.zipCode;
    }
}
