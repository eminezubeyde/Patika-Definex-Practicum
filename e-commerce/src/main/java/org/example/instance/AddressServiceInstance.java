package org.example.instance;

import org.example.service.concretes.AddressService;

public class AddressServiceInstance {
    private static AddressService instance;

    public AddressServiceInstance() {
    }

    public static AddressService getInstance() {
        if (instance == null) {
            instance = new AddressService();
        }
        return instance;
    }
}
