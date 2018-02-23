import java.util.ArrayList;

public class Bibliotheque
{
    private ArrayList<Document> listeDocument;
    
    public Bibliotheque()
    {
        this.listeDocument = new ArrayList();
    }
    
    public void ajouteDocBiblio(Document document)
    {
        this.listeDocument.add(document);
    }
    
    public void afficheDocument(Document document)
    {
        System.out.println("titre : " + document.titre);
        System.out.println("nom de l'auteur : " + document.nomAuteur);
        System.out.println("annee de publication : " + document.anneePubli);
        System.out.println("réference du document : ");
        for(int i=0; i<document.listeReference.size(); i++)
        {
            System.out.println("titre : " + document.listeReference.get(i).titre);
            System.out.println("nom de l'auteur : " + document.listeReference.get(i).nomAuteur);
        }
    }
    
    public boolean rechercheTitreDocument(String titre)
    {
        for(int i=0; i<listeDocument.size(); i++)
        {
            if(listeDocument.get(i).titre.compareTo(titre) == 0)
            {
                afficheDocument(listeDocument.get(i));
                return true;
            }
        }
        return false;
    }
    
    public boolean rechercheDocCitant(String titre)
    {
        boolean bool=false;
        
        for(int i=0; i<listeDocument.size(); i++)
        {
            for(int j=0; i<listeDocument.get(i).listeReference.size(); j++)
            {
                if(listeDocument.get(i).listeReference.get(j).titre.compareTo(titre) == 0)
                {
                    afficheDocument(listeDocument.get(i).listeReference.get(j));
                    bool = true;
                }
            }
        }
        
        return bool;
    }
}
