package com.bridgelabz.addressbookapp.services;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.exceptions.AddressBookException;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService{

    private List<AddressBookData> addressBookDataList = new ArrayList<>();

    @Override
    public List<AddressBookData> getAddressBookData() {
        return addressBookDataList;
    }

    @Override
    public AddressBookData getAddressBookDataById(int addressId) {
        return addressBookDataList.stream()
                                  .filter(addressBookData -> addressBookData.getAddressId() == addressId)
                                  .findFirst()
                                  .orElseThrow(() -> new AddressBookException("Address NOT Found for Id: " + addressId));
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = new AddressBookData(1, addressBookDTO);
        addressBookDataList.add(addressBookData);
        return addressBookData;
    }

    @Override
    public AddressBookData updateAddressBookData(int addressId, AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = this.getAddressBookDataById(addressId);
        addressBookData.setFirstName(addressBookDTO.firstName);
        addressBookData.setLastName(addressBookDTO.lastName);
        addressBookData.setAddress(addressBookDTO.address);
        addressBookData.setCity(addressBookDTO.city);
        addressBookData.setState(addressBookDTO.state);
        addressBookData.setEmailId(addressBookDTO.emailId);
        addressBookData.setPhoneNumber(addressBookDTO.phoneNumber);
        addressBookData.setZipCode(addressBookDTO.zipCode);
        addressBookDataList.set(addressId-1, addressBookData);
        return addressBookData;
    }

    @Override
    public void deleteAddressBookData(int addressId) {
        addressBookDataList.stream()
                           .filter(addressBookData -> addressBookData.getAddressId() == addressId)
                           .findFirst()
                           .orElseThrow(() -> new AddressBookException("Address NOT Found for Id: " + addressId));
        addressBookDataList.remove(addressId-1);
    }
}
