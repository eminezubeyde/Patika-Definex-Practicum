package org.example.dao.abstracts;

import org.example.model.Address;

import java.util.List;

public interface IAddressDao {
    void add(Address address);

    void delete(String name);

    List<Address> getAll();
}
