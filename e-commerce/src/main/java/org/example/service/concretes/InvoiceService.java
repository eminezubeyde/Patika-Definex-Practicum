package org.example.service.concretes;

import org.example.dao.concretes.InvoiceDao;
import org.example.model.Action;
import org.example.model.Customer;
import org.example.model.Invoice;
import org.example.service.abstracts.IInvoiceService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InvoiceService implements IInvoiceService {
    static InvoiceDao invoiceDao = new InvoiceDao();

    @Override
    public void add(Invoice invoice) {
        invoiceDao.add(invoice);
    }

    @Override
    public void delete(Invoice invoice) {
        invoiceDao.delete(invoice);

    }

    @Override
    public List<Invoice> getAll() {
        return invoiceDao.getAll();
    }

    @Override
    public List<Invoice> getGatherThanMInvoiceList(int value) {

        return invoiceDao.getAll().stream().filter(invoice -> invoice.getTotal() > value).collect(Collectors.toList());
    }

    @Override
    public void addAll(List<Invoice> invoiceList) {
        invoiceDao.addAll(invoiceList);
    }

    @Override
    public List<String> getSectorListByDateAndAvgAndAction(LocalDateTime date, int average, Action action) {
        List<Invoice> invoiceList = invoiceDao.getAll();
        List<String> sectorList = new ArrayList<>();

        for (Invoice invoice : invoiceList) {
            if (action == Action.UP) {
                if (invoice.getTotal() > average && date.getMonthValue() == invoice.getCreatedDate().getMonthValue()) {
                    sectorList.add(invoice.getSector());
                }
            } else {
                if (invoice.getTotal() < average && date.getMonthValue() == invoice.getCreatedDate().getMonthValue()) {
                    sectorList.add(invoice.getSector());
                }
            }
        }
        return sectorList;
    }


    @Override
    public int getTotalByDate(LocalDateTime date) {
        return invoiceDao.getAll().stream().filter(invoice -> invoice.getCreatedDate().getMonthValue() == date.getMonthValue()).mapToInt(Invoice::getTotal).sum();

    }

    @Override
    public double getAverageInvoiceAmountAboveValue(double value) {
        return invoiceDao.getAll().stream().filter(invoice -> invoice.getTotal() > value).mapToDouble(Invoice::getTotal).average().orElse(0);

    }

    @Override
    public List<Customer> getCustomerListByInvoiceTotalBelowValue(int value) {
        List<Customer> customers = new ArrayList<>();
        List<Invoice> invoiceList = invoiceDao.getAll();
        for (Invoice invoice : invoiceList) {
            if (invoice.getTotal() < value) {
                customers.add(invoice.getCustomer());
            }
        }


        return customers;
    }


}
