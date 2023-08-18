package org.example.model;

import java.util.List;

public class Client {

    private String firstname;
    private String lastname;
    private int clientID;
    private List<Sessionbank> sessionbankList;
    private String phoneNumber;

    public Client(String firstname, String lastname, int clientID, List<Sessionbank> sessionbankList, String phoneNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.clientID = clientID;
        this.sessionbankList = sessionbankList;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public List<Sessionbank> getSessionbankList() {
        return sessionbankList;
    }

    public void setSessionbankList(List<Sessionbank> sessionbankList) {
        this.sessionbankList = sessionbankList;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getId(int anInt) {
        return anInt;
    }

    public void setId(int anInt) {
    }
}
