package org.example.service.concretes;

import org.example.dao.concretes.AddressDao;
import org.example.model.Address;
import org.example.service.abstracts.IAddressService;

import java.util.List;

public class AddressService implements IAddressService {
    static AddressDao addressDao = new AddressDao();

    @Override
    public void add(Address address) {
        if (addressDao.getAll().stream().anyMatch(address1 -> address.getName().equals(address.getName()))) {
            System.out.println("bu isimde kayıtlı adres vardır.");
        }
        addressDao.add(address);
    }

    @Override
    public List<Address> getAll() {
        return addressDao.getAll();
    }
}
