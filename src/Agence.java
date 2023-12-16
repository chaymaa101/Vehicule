
import java.util.LinkedList;
import java.util.Scanner;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Agence {
    public static LinkedList<Vehicule> list= new LinkedList<Vehicule>();// Cette liste semble être destinée à stocker des instances de la classe Vehicule.
    public static void main(String[] args) {
        
        String rep;
        do{
        System.out.println("Menu:");
        System.out.println("0-Affichage de toute les véhicules");
        System.out.println("1- gestion des voitures");
        System.out.println("2- gestion des camionnettes");
        System.out.println("3- gestion des minibus");
        System.out.println("Entrez le numéro de votre choix");
        Scanner sc=new Scanner(System.in);
        int choix= sc.nextInt();
        switch(choix ){
            case 0:
                for(Vehicule v:list){
                    System.out.println(v);
                }
            break;
            case 1:
                AdministrationVoiture admin=new AdministrationVoiture();
                System.out.println("Menu pour la gestion des voitures:");
                System.out.println("0-Ajout de voiture");
                System.out.println("1- Suppression de voitures");
                System.out.println("2- Recherche par modele");
                System.out.println("3- Recherche par marque");
                System.out.println("4- Recherche par reference");
                System.out.println("5- Recherche par couleur");
                System.out.println("6-Afficher toute les voitures");
                System.out.println("Entrez le numéro de votre choix");
                int choix1= sc.nextInt();
                switch(choix1){
                    case 0:
            {
                try {
                    //admin.AjouterVehicule();
                    Voiture d=new Voiture("e","t","f","g");
                    VoituretUtile hee=new VoituretUtile();
                    hee.ajouterVoiture(d);
                } catch (SQLException ex) {
                    Logger.getLogger(Agence.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
                        
                        
                        break;

                    case 1:
                        admin.SupprimerVehicule();
                        break;
                    case 2:
                        admin.RechercheparModel();
                        break;
                    case 3:
                        admin.Rechercheparmarque();
                        break;
                    case 4:
                        admin.RechercheparReference();
                        break;
                    case 5:
                        admin.RechercheparCouleur();
                        break;
                    case 6:
                        admin.getAll();
                        break;
                    default:
                 
                }
                break;
            case 2:
                AdministrationCamionnettes adminc=new AdministrationCamionnettes();
                System.out.println("Menu pour la gestion des cammionnettes:");
                System.out.println("0-Ajout de camionnette");
                System.out.println("1- Suppression de camionnettes");
                System.out.println("2- Recherche par modele");
                System.out.println("3- Recherche par marque");
                System.out.println("4- Recherche par reference");
                System.out.println("5- Recherche par couleur");
                System.out.println("5- Recherche par charge maximale");
                System.out.println("6-Afficher toute les camionnettes");
                System.out.println("Entrez le numéro de votre choix");
                int choix2= sc.nextInt();
                switch(choix2){
                    case 0:
                        adminc.AjouterVehicule();
                        break;
                    case 1:
                        adminc.SupprimerVehicule();
                        break;
                    case 2:
                        adminc.RechercheparModel();
                        break;
                    case 3:
                        adminc.Rechercheparmarque();
                        break;
                    case 4:
                        adminc.RechercheparReference();
                        break;
                    case 5:
                        adminc.RechercheparCouleur();
                        break;
                    case 6:
                        adminc.getAll();
                        break;
                    case 7:
                        adminc.Rechercheparchargemax();
                        break;
                   default:
                } 
                break;
            case 3:
                AdministrationMinibus adminm=new AdministrationMinibus();
                System.out.println("Menu pour la gestion des voitures:");
                System.out.println("0-Ajout de voiture");
                System.out.println("1- Suppression de voitures");
                System.out.println("2- Recherche par modele");
                System.out.println("3- Recherche par marque");
                System.out.println("4- Recherche par reference");
                System.out.println("5- Recherche par couleur");
                System.out.println("6-Afficher toute les voitures");
                System.out.println("7-recherche par nombre de place");
                System.out.println("Entrez le numéro de votre choix");
                int choix3= sc.nextInt();
                switch(choix3){
                    case 0:
                        adminm.AjouterVehicule();
                        break;
                    case 1:
                        adminm.SupprimerVehicule();
                        break;
                    case 2:
                        adminm.RechercheparModel();
                        break;
                    case 3:
                        adminm.Rechercheparmarque();
                        break;
                    case 4:
                        adminm.RechercheparReference();
                        break;
                    case 5:
                        adminm.RechercheparCouleur();
                        break;
                    case 6:
                        adminm.getAll();
                        break;
                    case 7:
                        adminm.Rechercheparnbrdeplace();
                    default:
                 
                }  
            default:
                System.out.println("Erreur");
        }  
        
            System.out.println("si vous vloulez revenir au menu tapez o sinon tapez n");
            rep=sc.next();

        }while(rep.equals("o"));
        /// try

    }
    
}
