package org.example.instance;

import org.example.service.concretes.InvoiceService;

public class InvoiceServiceInstance {
    private static InvoiceService instance;

    private InvoiceServiceInstance() {
    }

    public static InvoiceService getInstance() {
        if (instance == null) {
            instance = new InvoiceService();
        }
        return instance;
    }
}
