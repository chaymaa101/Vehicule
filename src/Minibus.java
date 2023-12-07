/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Minibus extends Vehicule{
    private int nbrplace;

    public Minibus(String reference, String marque, String modele, String couleur,int nbrplace) {
        super(reference, marque, modele, couleur);
        this.nbrplace=nbrplace;
    }

    public int getNbrplace() {
        return nbrplace;
    }

    public void setNbrplace(int nbrplace) {
        this.nbrplace = nbrplace;
    }
    
    public String toString(){
         return "Minibus {" + "reference=" + this.getReference() + ", marque=" + this.getMarque() + ", modele=" + this.getModele() + ", couleur=" + this.getCouleur() + ", nombre de place ="+nbrplace +"}";
    }
}
