package com.sunglowsys.domain;

public class Address {

    private Long id;

    private String addressLine1;

    private String addressLine2;

    private String city;

    private String state;

    private String zipCode;

    public Address() {
        System.out.println("address object is created");
    }

    public Address(String addressLine1, String addressLine2, String city, String state, String zipCode) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void checkAddress(){

        System.out.println("Id:"+ 1001);
        System.out.println("AddressLine1:"+"Bhavan Nagar");
        System.out.println("AddressLine2:"+"Marehra");
        System.out.println("City:"+"Etha");
        System.out.println("State:"+"UP");
        System.out.println("ZipCode:"+"207401");

    }
}
