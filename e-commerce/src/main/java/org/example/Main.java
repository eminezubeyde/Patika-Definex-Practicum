package org.example;


import org.example.instance.*;
import org.example.model.*;
import org.example.service.concretes.*;
import org.example.util.AddressHelper;
import org.example.util.GenericHelper;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;


import static org.example.util.CustomerHelper.*;

public class Main {
    private static final CustomerService customerService = CustomerServiceInstance.getInstance();
    private static final AddressService addressService = AddressServiceInstance.getInstance();
    private static final InvoiceService invoiceService = InvoiceServiceInstance.getInstance();
    private static final OrderService orderService = OrderServiceInstance.getInstance();
    private static final ProductService productService = ProductServiceInstance.getInstance();
    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {


        choice();

        int secim = scanner.nextInt();
        while (secim != -1) {
            switch (secim) {
                case 0:
                    GenericHelper.defaultPostConstruct();
                    break;
                case 1:
                    Customer createdCustomer = createCustomer();
                    customerService.add(createdCustomer);
                    break;
                case 2:
                    String username = getCustomerUsername(); //  ilk adım hangi kullanıcı olduğunu kullanıcı adıyla alıyoruz.
                    Customer customer = customerService.getByUsername(username);
                    if (customer != null) {
                        Address address = AddressHelper.createAddressInfo();
                        customer.setAddress(address);// ilk adım.
                        addressService.add(address); // bunu tüm adreslere erişbilmek için ekledim.

                    }
                    break;
                case 3:
                    System.out.println(addressService.getAll());
                    break;
                case 4:
                    List<Invoice> invoiceM = invoiceService.getGatherThanMInvoiceList(500);
                    System.out.println(invoiceM);
                    break;
                case 5:

                    String username1 = getCustomerUsername(); //  ilk adım hangi müşteri olduğunu kullanıcı adıyla alıyoruz.
                    Customer customerDetails = customerService.getByUsername(username1); // "" veya olmayan bir kullanıcıya aitse null döner.
                    if (customerDetails != null) {
                        System.out.println(customerDetails.getOrderList());
                    } else {
                        System.out.println(username1 + " adında bir kullanıcı yok.");
                    }
                    break;
                case 6:
                    List<Customer> customerByLetter = customerService.getCustomersByLetter('U');
                    System.out.println(customerByLetter);
                    break;
                case 7:
                    List<Customer> customers = customerService.getAll();
                    System.out.println(customers);
                    break;
                case 8:
                    int totalPrice = invoiceService.getTotalByDate(LocalDateTime.of(2020, 6, 13, 2, 2));
                    System.out.println(totalPrice);
                    break;
                case 9:
                    System.out.println(invoiceService.getAll());

                    break;
                case 10:
                    List<String> sectorList = invoiceService.getSectorListByDateAndAvgAndAction(LocalDateTime.of(2020, 6, 13, 2, 2), 750, Action.DOWN);
                    System.out.println(sectorList);
                    break;
                case 11:
                    List<Invoice> invoiceList = invoiceService.getAll();
                    System.out.println(invoiceList);
                    break;
                case 12:
                    double average = invoiceService.getAverageInvoiceAmountAboveValue(250);
                    System.out.println(average);
                    break;
                case 13:
                    List<Customer> customerList = invoiceService.getCustomerListByInvoiceTotalBelowValue(500);
                    System.out.println(customerList);
                    break;
            }
            choice();
            secim = scanner.nextInt();
        }


    }


    public static void choice() {
        System.out.println("Otomatik tüm bilgileri olusturmak için  0 'a basınız");
        System.out.println("müşteri eklemek için 1 'e basınız");
        System.out.println("müşteriye adres eklemek için 2 'ye basınız");
        System.out.println("tüm adresleri göstermek için 3'e basınız.");
        System.out.println("500 lira üzerindeki faturaları görmek için 4'e basınız");
        System.out.println("musterinin sipariş detaylarını görmek için 5 e basınız.");
        System.out.println("içinde u harfi olan müşterileri görmek için 6 ya basınız");
        System.out.println("tüm müşterileri görmek için 7 ye basınız");
        System.out.println("haziran ayında kayıt olan müşterilerin faturalarınının toplam tutarını görmek için 8'e basınız");
        System.out.println("tüm faturaları görmek için 9'a basınız");
        System.out.println("haziran ayını faturalarını ortalaması 750 altı olan firmalarının hangi sektörde olduğunu bulmak için 10'a basınız");
        System.out.println("tüm faturaları görmek için 11 e basınız");
        System.out.println("Sistemdeki 250 tl  üstündeki faturaların ortalamasını hesaplamak için 12 'ye basınız");
        System.out.println("Sistemdeki 500TL altındaki faturalara sahip müşterileri listelemek için 13'e basınız");

    }


}