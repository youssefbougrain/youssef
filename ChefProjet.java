package com.entreprise.rh;

public class ChefProjet extends Permanent {

    public ChefProjet(String nom, double salaire, String agence) {
        super(nom, salaire, agence);
    }

    public double getPrime() {
        return 500;
    }

    @Override
    public String getPoste() {
        return "ChefProjet";
    }

    @Override
    public double getSalaire() {
        return super.getSalaire() + getPrime();
    }
}