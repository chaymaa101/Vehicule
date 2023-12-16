import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Scanner;

public class AgenceTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez choisir le type de véhicule :");
        System.out.println("1 - Voitures");
        System.out.println("2 - Camionnettes");
        System.out.println("3 - Mini-Bus");

        int option = sc.nextInt();

        switch (option) {
            case 1:
                gestionVoitures();
                break;
            case 2:
                //gestionCamionnettes();
                break;
            case 3:
               // gestionMinibus();
                break;
            default:
                System.out.println("Option invalide");
        }
    }

    static void gestionVoitures() {
        try {
            VoitureUtile voitureUtile = new VoitureUtile();
            Scanner sc = new Scanner(System.in);

            System.out.println("Menu de gestion des voitures :");
            System.out.println("1 - Ajouter une voiture");
            System.out.println("2 - Rechercher par modèle");
            System.out.println("3 - Rechercher par référence");

            int choix = sc.nextInt();

            switch (choix) {
                case 1:
                    System.out.println("Veuillez saisir le modèle de la voiture :");
                    String modele = sc.next();
                    System.out.println("Veuillez saisir la référence de la voiture :");
                    String reference = sc.next();
                    System.out.println("Veuillez saisir la couleur de la voiture :");
                    String couleur = sc.next();
                    System.out.println("Veuillez saisir la marque de la voiture :");
                    String marque = sc.next();

                    Voiture voiture = new Voiture(reference, modele, marque, couleur);
                    if (voitureUtile.ajouterVoiture(voiture)) {
                        System.out.println("Voiture ajoutée avec succès !");
                    } else {
                        System.out.println("Erreur lors de l'ajout de la voiture.");
                    }
                    break;

                case 2:
                    System.out.println("Veuillez saisir le modèle de la voiture à rechercher :");
                    String modeleRecherche = sc.next();
                    LinkedList<Voiture> voituresModele = voitureUtile.getVoitureByModele(modeleRecherche);
                    afficherListe(voituresModele);
                    break;

                case 3:
                    System.out.println("Veuillez saisir la référence de la voiture à rechercher :");
                    String refRecherche = sc.next();
                    LinkedList<Voiture> voituresRef = voitureUtile.getVoitureByReference(refRecherche);
                    afficherListe(voituresRef);
                    break;

                default:
                    System.out.println("Option invalide");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Ajoutez des méthodes similaires pour la gestion des camionnettes et des minibus

    static void afficherListe(LinkedList<? extends Vehicule> liste) {
        for (Vehicule v : liste) {
            System.out.println(v);
        }
    }
}
