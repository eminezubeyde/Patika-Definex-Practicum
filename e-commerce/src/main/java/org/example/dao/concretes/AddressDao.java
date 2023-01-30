package org.example.dao.concretes;

import org.example.dao.abstracts.IAddressDao;
import org.example.model.Address;

import java.util.ArrayList;
import java.util.List;

public class AddressDao implements IAddressDao {
    List<Address> addressList = new ArrayList<>();

    @Override
    public void add(Address address) {
        addressList.add(address);
    }

    @Override
    public void delete(String name) {
        addressList.removeIf(address -> address.getName().equals(name));
    }

    @Override
    public List<Address> getAll() {
        return addressList;
    }
    //removeIf metodu, bir listeyi belirtilen koşula göre filtrelemek için kullanılır.


}
