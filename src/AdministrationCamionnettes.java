
import java.util.LinkedList;
import java.util.Scanner;


public class AdministrationCamionnettes implements Administration {
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
        System.out.println("veuillez la charge maximale:");
        Double chargemax=sc.nextDouble();
        Camionnettes camionnette=new Camionnettes(ref,marque,modele,couleur,chargemax);
        Agence.list.add(camionnette);
        return true;
       }
        @Override
    public Camionnettes RechercheparReference() {
        System.out.println("Donez la reference de la camionnette a chercher ");
        Scanner sc=new Scanner(System.in);
        String ref=sc.next();
        Camionnettes cam=null;
        for (Vehicule c:Agence.list){
            if( c instanceof Camionnettes && c.getReference().equals(ref))
                cam=(Camionnettes)c;
        }
        return cam;
       }
    
        @Override
    public boolean SupprimerVehicule() {
        System.out.println("Donez la reference de la camionnette a supprimer");
        String ref=sc.next();
        for (Vehicule c:Agence.list){
            if( c instanceof Camionnettes && c.getReference().equals(ref)){
                Agence.list.remove(c);
                break;
            }
        }
        return true;
    }
    
        @Override
    public LinkedList<Camionnettes> getAll() {
            LinkedList<Camionnettes> camionnettes=new LinkedList<Camionnettes>();
            for (Vehicule c:Agence.list){
                if(c instanceof Camionnettes)
                    camionnettes.add((Camionnettes)c);
            }
            return camionnettes;
    }

    @Override
    public LinkedList<Camionnettes> RechercheparModel() {
        LinkedList<Camionnettes> camionnettes=new LinkedList<Camionnettes>();
        System.out.println("entrez le modele de la camionnete a chercher");
        String modele=sc.next();
        for(Vehicule c:Agence.list){
            if(c instanceof Camionnettes && c.getModele().equals(modele)){
                camionnettes.add((Camionnettes)c);
            }
        }
        return camionnettes;
    }

    @Override
    public LinkedList RechercheparCouleur() {
        LinkedList<Camionnettes> camionnettes=new LinkedList<Camionnettes>();
        System.out.println("entrez la couleur de la camionnettes a chercher");
        String couleur=sc.next();
        for(Vehicule c:Agence.list){
            if(c instanceof Camionnettes && c.getCouleur().equals(couleur)){
                camionnettes.add((Camionnettes)c);
            }
        }
        return camionnettes;
    }

    @Override
    public LinkedList Rechercheparmarque() {
        LinkedList<Camionnettes> camionnettes=new LinkedList<Camionnettes>();
        System.out.println("entrez la marque de la cammionnette a chercher");
        String marque=sc.next();
        for(Vehicule c:Agence.list){
            if(c instanceof Camionnettes && c.getCouleur().equals(marque)){
                camionnettes.add((Camionnettes)c);
            }
        }
        return camionnettes;
    }
        public LinkedList<Camionnettes> Rechercheparchargemax() {
        LinkedList<Camionnettes> camionnettes=new LinkedList<Camionnettes>();
        System.out.println("entrez la charge maximale de la camionnete a chercher");
        double chargemax=sc.nextDouble();
        for(Vehicule c:Agence.list){
            if(c instanceof Camionnettes && ((Camionnettes)c).getChargemax()>=chargemax  ){
                camionnettes.add((Camionnettes)c);
            }
            
        }
        return camionnettes;
    }



    
}
