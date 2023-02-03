package org.example.util;

import org.example.instance.*;
import org.example.model.Customer;
import org.example.model.Invoice;
import org.example.model.Order;
import org.example.model.Product;
import org.example.service.concretes.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.example.util.CustomerHelper.createCustomerList;
import static org.example.util.ProductHelper.createProductList;

public class GenericHelper {
    // private static final CustomerService customerService = new CustomerService();
    private static final  CustomerService customerService = CustomerServiceInstance.getInstance();
    private static final AddressService addressService = AddressServiceInstance.getInstance();
    private static final InvoiceService invoiceService = InvoiceServiceInstance.getInstance();
    private static final OrderService orderService = OrderServiceInstance.getInstance();
    private static final ProductService productService = ProductServiceInstance.getInstance();

    public static void defaultPostConstruct() {
        List<Customer> customers = createCustomerList();
        List<Product> products = createProductList();
        // aşağıda sipariş detayları olusturuldu ve eklendi.
        Order order = new Order();
        order.setProductList(List.of(products.get(0), products.get(1), products.get(2)));
        Order order1 = new Order();
        List<Product> productListForOrder1 = new ArrayList<>();
        productListForOrder1.add(products.get(1));
        order1.setProductList(productListForOrder1);

        Invoice invoiceForOrder1 = new Invoice();
        invoiceForOrder1.setCustomer(customers.get(1));
        invoiceForOrder1.setTotal(order1.getProductList().stream().mapToInt(Product::getPrice).sum());
        invoiceForOrder1.setCompany("DefineX");
        invoiceForOrder1.setSector("software");
        invoiceForOrder1.setCreatedDate(LocalDateTime.of(2020, 6, 10, 10, 5));
        order1.setInvoice(invoiceForOrder1);
        order1.setId(2L);


        customers.get(1).getOrderList().add(order1);


        Invoice invoice = new Invoice();
        invoice.setCustomer(customers.get(0));
        invoice.setTotal(order.getProductList().stream().mapToInt(Product::getPrice).sum());
        invoice.setCompany("DefineX");
        invoice.setSector("bilişim");
        invoice.setCreatedDate(LocalDateTime.now());

        order.setInvoice(invoice);
        customers.get(0).getOrderList().add(order);

        customerService.addAll(customers); // default add 5 customer in customer dao
        productService.addAll(products); // default add 5 product in product dao
        invoiceService.add(invoice);
        orderService.add(order);
        orderService.add(order1);
        invoiceService.add(invoiceForOrder1);


    }
}
