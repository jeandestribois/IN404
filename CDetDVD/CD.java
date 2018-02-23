
/**
 * Décrivez votre classe CD ici.
 * Cette classe permet d'exprimer les informations voulu du cd et de méthodes allant avec.
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class CD
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String titre, artisteOuGroupe;
    private int nbreTitre;
    
    /**
     * Constructeur d'objets de classe CD
     */
    public CD(String titre, String artisteOuGroupe, int nbreTitre)
    {
        this.titre=titre;
        this.artisteOuGroupe=artisteOuGroupe;
        this.nbreTitre=nbreTitre;
    }
    
    public String avoirTitre()
    {
        return this.titre;
    }
    
    public String avoirArtisteOuGroupe()
    {
        return this.artisteOuGroupe;
    }
    
    public int avoirNbreTitre()
    {
        return this.nbreTitre;
    }
    
    
    
}
