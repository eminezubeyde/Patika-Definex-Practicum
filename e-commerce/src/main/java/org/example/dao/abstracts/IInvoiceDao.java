package org.example.dao.abstracts;

import org.example.model.Invoice;

import java.util.List;

public interface IInvoiceDao {
    void add(Invoice invoice);

    void delete(Invoice invoice);

    List<Invoice> getAll();

    void addAll(List<Invoice> invoiceList);
}

