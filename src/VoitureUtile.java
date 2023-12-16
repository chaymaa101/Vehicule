import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;
import java.util.LinkedList;
public class VoitureUtile{
    private Connection con;
    public VoitureUtile() throws SQLException{
        con= DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=Vehicule;encrypt=true;trustServerCertificate=true", "sa", "chaymaa123");
    }
    public LinkedList<Voiture> getVoitureByModele(String modele)throws  SQLException{
        LinkedList<Voiture> voitures=new LinkedList<>();
        Statement stmt=con.createStatement();
        ResultSet rs =stmt.executeQuery("select * from voiture where modele like '"+modele+"'");
        while( rs.next()){
           Voiture v =new Voiture(rs.getString("reference"),
                   rs.getString("marque"),
                   rs.getString("modele"),
                   rs.getString("couleur"));
           voitures.add(v);
    }       
        return voitures;
    }
    public boolean ajouterVoiture(Voiture v) throws SQLException{
        Statement stmt=con.createStatement();
        String query = "insert into db_accessadmin.Voiture (reference,marque,modele,couleur) values(?,?,?,?)";//'utilisation de PreparedStatement au lieu de Statement pour éviter les attaques par injection SQL. 
        try (PreparedStatement pstmt = con.prepareStatement(query)) {
            pstmt.setString(1, v.getReference());
            pstmt.setString(2, v.getMarque());
            pstmt.setString(3, v.getModele());
            pstmt.setString(4, v.getCouleur());
            int nbUpdated = pstmt.executeUpdate();
            return nbUpdated > 0;
        }
    }
    public LinkedList<Voiture> getVoitureByReference(String modele)throws  SQLException{
        LinkedList<Voiture> voitures=new LinkedList<>();
        Statement stmt=con.createStatement();
        ResultSet rs =stmt.executeQuery("select * from voiture where modele like '"+modele+"'");
        while( rs.next()){
           Voiture v =new Voiture(rs.getString("reference"),
                   rs.getString("marque"),
                   rs.getString("modele"),
                   rs.getString("couleur"));
           voitures.add(v);
    }       
        return voitures;
    }
    public LinkedList<Voiture> getVoitureByMarque(String marque)throws  SQLException{
        LinkedList<Voiture> voitures=new LinkedList<>();
        Statement stmt=con.createStatement();
        ResultSet rs =stmt.executeQuery("select * from voiture where modele like '"+marque+"'");
        while( rs.next()){
           Voiture v =new Voiture(rs.getString("reference"),
                   rs.getString("marque"),
                   rs.getString("modele"),
                   rs.getString("couleur"));
           voitures.add(v);
    }       
        return voitures;
    }
    public LinkedList<Voiture> getVoitureByCouleur(String couleur)throws  SQLException{
        LinkedList<Voiture> voitures=new LinkedList<>();
        Statement stmt=con.createStatement();
        ResultSet rs =stmt.executeQuery("select * from voiture where modele like '"+couleur+"'");
        while( rs.next()){
           Voiture v =new Voiture(rs.getString("reference"),
                   rs.getString("marque"),
                   rs.getString("modele"),
                   rs.getString("couleur"));
           voitures.add(v);
    }       
        return voitures;
    }
    
}
