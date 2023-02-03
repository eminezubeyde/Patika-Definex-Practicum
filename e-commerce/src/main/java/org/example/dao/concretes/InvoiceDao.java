package org.example.dao.concretes;

import org.example.dao.abstracts.IInvoiceDao;
import org.example.model.Invoice;

import java.util.ArrayList;
import java.util.List;

public class InvoiceDao implements IInvoiceDao {
    List<Invoice> invoiceList = new ArrayList<>();

    @Override
    public void add(Invoice invoice) {
        invoiceList.add(invoice);
    }

    @Override
    public void delete(Invoice invoice) {
        invoiceList.remove(invoice);

    }

    @Override
    public List<Invoice> getAll() {
        return invoiceList;
    }

    @Override
    public void addAll(List<Invoice> invoiceList) {
        invoiceList.addAll(invoiceList);
    }
}
