package com.entreprise.rh;

public abstract class Employe {

    protected String matricule;
    protected String nom;
    protected String agence;

    private static int nbEmployes = 0;

    public Employe(String nom, String agence) {
        nbEmployes++;
        this.matricule = "E" + nbEmployes;
        this.nom = nom;
        this.agence = agence;
    }

    public Employe(String nom) {
        this(nom, "Casablanca");
    }

    public abstract String getPoste();

    public abstract double getSalaire();

    public static int getNbEmployes() {
        return nbEmployes;
    }

    @Override
    public String toString() {
        return "matricule=" + matricule
                + ", nom=" + nom
                + ", agence=" + agence;
    }
}