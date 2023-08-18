package org.example.util;

import org.example.model.Client;
import org.example.model.OperateEnum;
import org.example.model.Sessionbank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IHM {

    List<Sessionbank> sessionbankList = new ArrayList<>();



    Scanner scanner = new Scanner(System.in);
        while (true) {
        System.out.println("1. Effectuer un dépôt");
        System.out.println("2. Effectuer un retrait");
        System.out.println("3. Afficher le solde");
        System.out.println("4. Quitter");
        System.out.print("Choix : ");
        int choix = scanner.nextInt();

        switch (choix) {
            case 1:
                System.out.print("Montant du dépôt : ");
                double montantDepot = scanner.nextDouble();
                Sessionbank.Operate(montantDepot, OperationEnum.DEPOT);
                break;
            case 2:
                System.out.print("Montant du retrait : ");
                double montantRetrait = scanner.nextDouble();
                compte.effectuerOperation(montantRetrait, OperateEnum.deposit);
                break;
            case 3:
                System.out.println("Solde : " + compte.getSolde());
                break;
            case 4:
                System.out.println("Au revoir !");
                scanner.close();
                System.exit(0);
        }
    }
}
