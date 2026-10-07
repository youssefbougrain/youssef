package com.entreprise.rh;

public class Commercial extends Employe {

    private double fixe;
    private double chiffreAffaires;

    public Commercial(String nom, double fixe,
                      double chiffreAffaires, String agence) {

        super(nom, agence);

        if (fixe <= 0)
            fixe = 0; // à remplacer à l'étape 4

        if (chiffreAffaires < 0)
            chiffreAffaires = 0; // à remplacer à l'étape 4

        this.fixe = fixe;
        this.chiffreAffaires = chiffreAffaires;
    }

    @Override
    public String getPoste() {
        return "Commercial";
    }

    @Override
    public double getSalaire() {
        return fixe + chiffreAffaires * 5 / 100;
    } // fixe + 5 % du CA

    @Override
    public String toString() {
        return getPoste() + "["
                + super.toString()
                + ", fixe=" + fixe
                + ", chiffreAffaires=" + chiffreAffaires
                + "]";
    }
}
