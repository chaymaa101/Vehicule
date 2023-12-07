
import java.util.LinkedList;
import java.util.Scanner;


public class AdministrationVoiture implements Administration {
        Scanner sc=new Scanner(System.in);
    
    public boolean AjouterVehicule() {
        System.out.println("veuillez la reference:");
        String ref=sc.next();
        System.out.println("veuillez la marque:");
        String marque=sc.next();
        System.out.println("veuillez le modele:");
        String modele=sc.next();
        System.out.println("veuillez la couleur:");
        String couleur=sc.next();
        Voiture voiture=new Voiture(ref,marque,modele,couleur);
        Agence.list.add(voiture);
        return true;
       }
        @Override
    public Voiture RechercheparReference() {
        System.out.println("Donez la reference du voiturea chercher ");
        Scanner sc=new Scanner(System.in);
        String ref=sc.next();
        Voiture voiture=null;
        for (Vehicule v:Agence.list){
            if( v instanceof Voiture && v.getReference().equals(ref))
                voiture=(Voiture)v;
        }
        return voiture;
       }
    
        @Override
    public boolean SupprimerVehicule() {
        System.out.println("Donez la reference du voiture a supprimer");
        String ref=sc.next();
        for (Vehicule v:Agence.list){
            if( v instanceof Voiture && v.getReference().equals(ref)){
                Agence.list.remove(v);
                break;
            }
        }
        return true;
    }
    
        @Override
    public LinkedList<Voiture> getAll() {
            LinkedList<Voiture> voitures=new LinkedList<Voiture>();
            for (Vehicule v:Agence.list){
                if(v instanceof Voiture)
                    voitures.add((Voiture)v);
            }
            return voitures;
    }

    @Override
    public LinkedList<Voiture> RechercheparModel() {
        LinkedList<Voiture> voitures=new LinkedList<Voiture>();
        System.out.println("entrez le modele de voiture a chercher");
        String modele=sc.next();
        for(Vehicule v:Agence.list){
            if(v instanceof Voiture && v.getModele().equals(modele)){
                voitures.add((Voiture)v);
            }
        }
        return voitures;
    }

    @Override
    public LinkedList RechercheparCouleur() {
        LinkedList<Voiture> voitures=new LinkedList<Voiture>();
        System.out.println("entrez la couleur de voiture a chercher");
        String couleur=sc.next();
        for(Vehicule v:Agence.list){
            if(v instanceof Voiture && v.getCouleur().equals(couleur)){
                voitures.add((Voiture)v);
            }
        }
        return voitures;
    }

    @Override
    public LinkedList Rechercheparmarque() {
        LinkedList<Voiture> voitures=new LinkedList<Voiture>();
        System.out.println("entrez la marque de voiture a chercher");
        String marque=sc.next();
        for(Vehicule v:Agence.list){
            if(v instanceof Voiture && v.getCouleur().equals(marque)){
                voitures.add((Voiture)v);
            }
        }
        return voitures;
    }



    
}
