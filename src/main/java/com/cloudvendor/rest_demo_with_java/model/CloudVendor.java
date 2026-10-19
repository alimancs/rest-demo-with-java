package com.cloudvender.rest_demo_with_java.model;

public class CloudVendor {
    private String id;
    private String name;
    private String phoneNumber;
    private String address;

    public CloudVendor() {};
    public CloudVendor(String id, String name, String phoneNumber, String address) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    };

    public String getId() {
        return id;
    }
    public void setId(String newId) {
        this.id = newId;
    }

    public String getName() {
        return name;
    }
    public void setName(String newName) {
        this.name = newName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String newPhoneNumber) {
        this.phoneNumber = newPhoneNumber;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String newAddress) {
        this.address = newAddress;
    }
}