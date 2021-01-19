package com.bridgelabz.addressbookapp.controllers;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AdressBookController {

    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<String> getAddressBookData() {
        return new ResponseEntity<String >("Get Call Success", HttpStatus.OK);
    }

    @GetMapping("/get/{addressId}")
    public ResponseEntity<String> getAddressBookData(@PathVariable("addressId") int addressId) {
        return new ResponseEntity<String>("Get Call Success for id: " + addressId, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<String> addAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
        return new ResponseEntity<String>("Created Employee Payroll Data for: " + addressBookDTO, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
        return new ResponseEntity<String>("Updated Employee Payroll Data for: " + addressBookDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{addressId}")
    public ResponseEntity<String> deleteAddressBookData(@PathVariable("addressId") int addressId) {
        return new ResponseEntity<String>("Delete Call Success for id: " + addressId, HttpStatus.OK);
    }
}
