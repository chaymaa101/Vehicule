/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public  abstract class Vehicule {
     private final String reference;
     private final String marque;
     private final String modele;
     private String couleur;

    public Vehicule(String reference, String marque, String modele, String couleur) {
        this.reference = reference;
        this.marque = marque;
        this.modele = modele;
        this.couleur = couleur;
    }
     
    public String getReference() {
        return reference;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return "Vehicule{" + "reference=" + reference + ", marque=" + marque + ", modele=" + modele + ", couleur=" + couleur + '}';
    }
     
    
    
}
