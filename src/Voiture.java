/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Voiture extends Vehicule {
    
    public Voiture(String reference, String marque, String modele, String couleur) {
        super(reference, marque, modele, couleur);
    }
    public String toString(){
         return "Voiture{" + "reference=" + this.getReference() + ", marque=" + this.getMarque() + ", modele=" + this.getModele() + ", couleur=" + this.getCouleur() + '}';
    }
    
}
