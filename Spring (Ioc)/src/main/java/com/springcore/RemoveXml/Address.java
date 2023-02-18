package com.springcore.RemoveXml;

public class Address {
    private String city;
    private String country;

    public void setCity(String city){
        this.city=city;
    }
    public void setCountry(String country){
        this.country=country;
    }
    public String getCity(){
        return city;
    }
    public String getCountry(){
        return country;
    }
    public Address(String city,String country){
        this.city=city;
        this.country=country;
    }
    public Address(){
        //Default constructor
    }

}
