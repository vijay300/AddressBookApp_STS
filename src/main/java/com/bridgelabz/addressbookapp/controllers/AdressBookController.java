package com.bridgelabz.addressbookapp.controllers;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AdressBookController {

    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<ResponseDTO> getAddressBookData() {
        AddressBookData addressBookData = new AddressBookData(1,
                                new AddressBookDTO("Vijay", "Kumar","31-31",
                                "Vizag", "AP","vijay@mail.com",8979768,7897));
        ResponseDTO responseDTO = new ResponseDTO("Get Call Success", addressBookData);
        return new ResponseEntity<ResponseDTO >(responseDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{addressId}")
    public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("addressId") int addressId) {
        AddressBookData addressBookData = new AddressBookData(1,
                                            new AddressBookDTO("Vijay", "Kumar","31-31",
                                            "Vizag", "AP","vijay@mail.com",8979768,7897));
        ResponseDTO responseDTO = new ResponseDTO("Get Call Success", addressBookData);
        return new ResponseEntity<ResponseDTO >(responseDTO, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = new AddressBookData(1, addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Get Call Success", addressBookData);
        return new ResponseEntity<ResponseDTO >(responseDTO, HttpStatus.OK);
    }

    @PutMapping("/update/{addressId}")
    public ResponseEntity<ResponseDTO> updateAddressBookData(
                                    @PathVariable("addressId") int addressId,
                                    @RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = new AddressBookData(addressId, addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Updated Address Book Successfully ", "Address Id" + addressBookDTO);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{addressId}")
    public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("addressId") int addressId) {
        ResponseDTO responseDTO = new ResponseDTO("Deleted Address Successfully "," Deleted ID: " + addressId);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
}
