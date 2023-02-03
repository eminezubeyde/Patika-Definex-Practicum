package org.example.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Address {
    private String name;
    private String country;
    private String city;
    private String street;
    private int no;


    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", no=" + no +
                '}';
    }
}

