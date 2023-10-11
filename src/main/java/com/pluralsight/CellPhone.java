package com.pluralsight;

public class CellPhone{
    private long serialNumber;
    private String model;
    private String carrier;
    private long phoneNumber;
    private String owner;
    public CellPhone(){
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = 0;
        this.owner = "";
    }

    //getters
    public long getSerialNumber(){
        return serialNumber;
    }
    public String getModel(){
        return model;
    }
    public String getCarrier(){
        return carrier;
    }
    public long getPhoneNumber(){
        return phoneNumber;
    }
    public String getOwner(){
        return owner;
    }

    //setters
    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
}
