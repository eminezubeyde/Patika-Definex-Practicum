package org.example.util;

import org.example.model.Address;

import java.util.Scanner;

public class AddressHelper {
    static Scanner scanner = new Scanner(System.in);

    public static Address createAddressInfo() {
        System.out.println("adres ismi giriniz");
        String name = scanner.next();
        System.out.println("ülke bilgisi giriniz");
        String country = scanner.next();
        System.out.println("şehir bilgisi giriniz");
        String city = scanner.next();
        System.out.println("sokak bilgisi giriniz");
        String street = scanner.next();
        System.out.println("kapı numarası giriniz");
        int no = scanner.nextInt();
        return new Address(country, city, street, no, name);


    }
}
