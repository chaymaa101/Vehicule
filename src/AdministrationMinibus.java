
import java.util.LinkedList;
import java.util.Scanner;


public class AdministrationMinibus implements Administration {
        Scanner sc=new Scanner(System.in);
    
        @Override
    public boolean AjouterVehicule() {
        System.out.println("veuillez la reference:");
        String ref=sc.next();
        System.out.println("veuillez la marque:");
        String marque=sc.next();
        System.out.println("veuillez le modele:");
        String modele=sc.next();
        System.out.println("veuillez la couleur:");
        String couleur=sc.next();
        System.out.println("veuillez nombre de place:");
        int nbrplace=sc.nextInt();
        Minibus minibus=new Minibus(ref,marque,modele,couleur,nbrplace);
        Agence.list.add(minibus);
        return true;
       }
        @Override
    public Minibus RechercheparReference() {
        System.out.println("Donez la reference du minibus a chercher ");
        Scanner sc=new Scanner(System.in);
        String ref=sc.next();
        Minibus minibus=null;
        for (Vehicule v:Agence.list){
            if( v instanceof Voiture && v.getReference().equals(ref))
                minibus=(Minibus)v;
        }
        return minibus;
       }
    
        @Override
    public boolean SupprimerVehicule() {
        System.out.println("Donez la reference du minibus a supprimer");
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
    public LinkedList<Minibus> getAll() {
            LinkedList<Minibus> minibus=new LinkedList<Minibus>();
            for (Vehicule v:Agence.list){
                if(v instanceof Minibus)
                    minibus.add((Minibus)v);
            }
            return minibus;
    }

    @Override
    public LinkedList<Minibus> RechercheparModel() {
        LinkedList<Minibus> minibus=new LinkedList<Minibus>();
        System.out.println("entrez le modele du minibus a chercher");
        String modele=sc.next();
        for(Vehicule v:Agence.list){
            if(v instanceof Minibus && v.getModele().equals(modele)){
                minibus.add((Minibus)v);
            }
        }
        return minibus;
    }

    @Override
    public LinkedList RechercheparCouleur() {
        LinkedList<Minibus> minibus=new LinkedList<Minibus>();
        System.out.println("entrez la couleur du minibus a chercher");
        String couleur=sc.next();
        for(Vehicule v:Agence.list){
            if(v instanceof Minibus && v.getCouleur().equals(couleur)){
                minibus.add((Minibus)v);
            }
        }
        return minibus;
    }

    @Override
    public LinkedList Rechercheparmarque() {
        LinkedList<Minibus> minibus=new LinkedList<Minibus>();
        System.out.println("entrez la marque du minibus a chercher");
        String marque=sc.next();
        for(Vehicule v:Agence.list){
            if(v instanceof Minibus && v.getCouleur().equals(marque)){
                minibus.add((Minibus)v);
            }
        }
        return minibus;
    }
        public LinkedList Rechercheparnbrdeplace() {
        LinkedList<Minibus> minibus=new LinkedList<Minibus>();
        System.out.println("entrez le nombre de place du minibus a chercher");
        int nbrplace =sc.nextInt();
        for(Vehicule v:Agence.list){
            if(v instanceof Minibus && ((Minibus)v).getNbrplace()==nbrplace){
                minibus.add((Minibus)v);
            }
        }
        return minibus;
    }


    
}
