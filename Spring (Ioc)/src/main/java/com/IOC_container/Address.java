package com.IOC_container;

public class Address {
    String city;
    String province;
    String country;

    public Address(String city, String province, String country) {
        this.city = city;
        this.province = province;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
