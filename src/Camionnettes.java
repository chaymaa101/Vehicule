/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Camionnettes extends Voiture{
    private double chargemax;
    public Camionnettes(String reference, String marque, String modele, String couleur,Double chargemax) {
        super(reference, marque, modele, couleur);
        this.chargemax=chargemax;
    }

    public double getChargemax() {
        return chargemax;
    }

    public void setChargemax(double chargemax) {
        this.chargemax = chargemax;
    }
    public String toString(){
         return "Camionnettes {" + "reference=" + this.getReference() + ", marque=" + this.getMarque() + ", modele=" + this.getModele() + ", couleur=" + this.getCouleur() + ", charge maximale ="+chargemax +"}";
    }
    
}
