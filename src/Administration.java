
import java.util.LinkedList;

public interface Administration<T extends Vehicule> {
    public boolean AjouterVehicule();
    public boolean SupprimerVehicule();
    public LinkedList<T> getAll();
    public LinkedList<T> RechercheparModel();
    public LinkedList<T> RechercheparCouleur();
    public LinkedList<T> Rechercheparmarque();
    public T RechercheparReference();
}
