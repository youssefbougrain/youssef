package com.entreprise.rh;

public class Permanent extends Employe {

    private double salaireMensuel;

    public Permanent(String nom, double salaire) {
        super(nom);

        if (salaire <= 0)
            salaire = 0; // à remplacer à l'étape 4

        this.salaireMensuel = salaire;
    }

    public Permanent(String nom, double salaire, String agence) {
        super(nom, agence);

        if (salaire <= 0)
            salaire = 0; // à remplacer à l'étape 4

        this.salaireMensuel = salaire;
    }

    @Override
    public String getPoste() {
        return "Permanent";
    }

    @Override
    public double getSalaire() {
        return salaireMensuel;
    }

    @Override
    public String toString() {
        return getPoste() + "["
                + super.toString()
                + ", salaire=" + getSalaire()
                + "]";
    }
}