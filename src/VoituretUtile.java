
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
public class VoituretUtile {

    private Connection con;
    
    public VoituretUtile() throws SQLException {

        con = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=Vehicule;encrypt=true;trustServerCertificate=true ",
                "sa", "chaymaa123");
    }

    public LinkedList<Voiture> getVoitureByModele(String modele) throws SQLException {
        LinkedList<Voiture> voitures = new LinkedList<Voiture>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from voiture where modele like '" + modele + "' ");

        while (rs.next()) {
            Voiture v = new Voiture(rs.getString("reference"), rs.getString("modele"), 
                    rs.getString("marque"), rs.getString("couleur"));
            voitures.add(v);
        }
        return voitures;
    }

    public boolean ajouterVoiture(Voiture d) throws SQLException {
        Statement stmt = con.createStatement();
        String query = "insert into voiture(marque,reference,modele,couleur) "
                + "values ('" + d.getMarque() + "','" + d.getReference() + "','"
                + d.getModele() + "','" + d.getCouleur() + "')";
        int nbUpdated = stmt.executeUpdate(query);
        return nbUpdated > 0;
    }

    public LinkedList<Voiture> getVoitureReference() {
        return null;
    }

    public LinkedList<Voiture> getVoitureByCouleur() {
        return null;
    }

    public LinkedList<Voiture> getVoitureeByCharge() {
        return null;
    }

    public LinkedList<Voiture> getAllVoiture() throws SQLException {

        LinkedList<Voiture> voitures = new LinkedList<Voiture>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from voiture");

        while (rs.next()) {
            Voiture d = new Voiture(null, null, null, null);
            voitures.add(d);

        }

        return voitures;
    }

    public boolean supprimerVehicule(Voiture d) {
        //...............
        return true;
    }
}
