package com.bridgelabz.addressbookapp.services;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

import java.util.List;

public interface IAddressBookService {

    List<AddressBookData> getAddressBookData();

    AddressBookData getAddressBookDataById(int addressId);

    AddressBookData createAddressBookData(AddressBookDTO addressBookDTO);

    AddressBookData updateAddressBookData(int addressId, AddressBookDTO addressBookDTO);

    void deleteAddressBookData(int addressId);
}
