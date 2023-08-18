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
}
