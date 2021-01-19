package com.bridgelabz.addressbookapp.services;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

import java.util.ArrayList;
import java.util.List;

public class AddressBookService implements IAddressBookService{

    @Override
    public List<AddressBookData> getAddressBookData() {
        List<AddressBookData> addressBookDataList = new ArrayList<>();
        addressBookDataList.add(new AddressBookData(1, new AddressBookDTO("Vijay", "Kumar","31-31",
                "Vizag", "AP","vijay@mail.com",8979768,7897)));
        return addressBookDataList;
    }

    @Override
    public AddressBookData getAddressBookDataById(int addressId) {
        AddressBookData addressBookData = new AddressBookData(1, new AddressBookDTO("Vijay", "Kumar","31-31",
                                            "Vizag", "AP","vijay@mail.com",8979768,7897));
        return addressBookData;
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = new AddressBookData(1, new AddressBookDTO("Vijay", "Kumar","31-31",
                                    "Vizag", "AP","vijay@mail.com",8979768,7897));
        return addressBookData;
    }

    @Override
    public AddressBookData updateAddressBookData(int addressId, AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = new AddressBookData(1, new AddressBookDTO("Vijay", "Kumar","31-31",
                                            "Vizag", "AP","vijay@mail.com",8979768,7897));
        return addressBookData;
    }

    @Override
    public void deleteAddressBookData(int addressId) {

    }
}
