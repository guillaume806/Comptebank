package org.example.model;

import java.util.List;

public class Sessionbank {

    private double solde;
    private int clientID;
    private List<Operate> operates;

    public Sessionbank(double solde, int clientID, List<Operate> operates) {
        this.solde = solde;
        this.clientID = clientID;
        this.operates = operates;
    }

    public String getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public List<Operate> getOperates() {
        return operates;
    }

    public void setOperates(List<Operate> operates) {
        this.operates = operates;
    }

    public int getId() {
    }
}
