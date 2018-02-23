import java.util.ArrayList;


public class Document
{
    public String titre, nomAuteur;
    public int anneePubli;
    public ArrayList<Document> listeReference;
    
    public Document(String titre, String nomAuteur, int anneePubli)
    {
        this.titre = titre;
        this.nomAuteur = nomAuteur;
        this.anneePubli = anneePubli;
        this.listeReference = new ArrayList();
    }
    
    public void ajoutReference(Document reference)
    {
        listeReference.add(reference);
    }
}
