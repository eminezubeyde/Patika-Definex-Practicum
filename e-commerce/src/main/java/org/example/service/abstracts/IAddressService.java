package org.example.service.abstracts;

import org.example.model.Address;

import java.util.List;

public interface IAddressService {
    void add(Address address);

    List<Address> getAll();

}
