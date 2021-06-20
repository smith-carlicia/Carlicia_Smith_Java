package com.company;

public class Address {

    private String streetOne;
    private String streetTwo;
    private String city;
    private String state;
    private String zipcode;

    private String billingStreetOne;
    private String getBillingStreetTwo;
    private String billingCity;
    private String billingState;
    private String billingZipcode;



    public String getStreetOne() {
        return streetOne;
    }

    public void setStreetOne(String streetOne) {
        this.streetOne = streetOne;
    }

    public String getStreetTwo() {
        return streetTwo;
    }

    public void setStreetTwo(String streetTwo) {
        this.streetTwo = streetTwo;
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

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getBillingStreetOne() {
        return billingStreetOne;
    }

    public void setBillingStreetOne(String billingStreetOne) {
        this.billingStreetOne = billingStreetOne;
    }

    public String getBillingStreetTwo() {
        return getBillingStreetTwo;
    }

    public void setBillingStreetTwo(String getBillingStreetTwo) {
        this.getBillingStreetTwo = getBillingStreetTwo;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingState() {
        return billingState;
    }

    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }

    public String getBillingZipcode() {
        return billingZipcode;
    }

    public void setBillingZipcode(String billingZipcode) {
        this.billingZipcode = billingZipcode;
    }
}
