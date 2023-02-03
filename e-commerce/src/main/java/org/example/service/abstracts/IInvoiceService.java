package org.example.service.abstracts;

import org.example.model.Action;
import org.example.model.Customer;
import org.example.model.Invoice;

import java.time.LocalDateTime;
import java.util.List;

public interface IInvoiceService {
    void add(Invoice invoice);

    void delete(Invoice invoice);

    List<Invoice> getAll();

    List<Invoice> getGatherThanMInvoiceList(int value);

    void addAll(List<Invoice> invoiceList);

    List<String> getSectorListByDateAndAvgAndAction(LocalDateTime date, int average, Action action);

    int getTotalByDate(LocalDateTime date);

    double getAverageInvoiceAmountAboveValue(double value);

    List<Customer> getCustomerListByInvoiceTotalBelowValue(int value);




}
