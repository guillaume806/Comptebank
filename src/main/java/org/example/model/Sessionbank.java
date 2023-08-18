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
}
