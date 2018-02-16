
/**
 * Décrivez votre classe ChaineCryptee ici.
 * Cette classe permet de chiffrer/déchiffrer une chaine de carractère utilisant une méthode de décalage.
 * @author (Jean Destribois)
 * @version (16/02/2018)
 */

public class ChaineCryptee
{
    private String chaine;
    private int decalage;

    /**
     * Constructeur d'objets de classe ChaineCryptee
     */
    public ChaineCryptee(String ChaineDeCaractere, int DecalageDesLettres)
    {
        chaine=ChaineDeCaractere;
        decalage=DecalageDesLettres;
    }

    /**
     * Méthode permettant de déchiffrer une chaine de caractère
     */
    public String decrypte()
    {
        if(chaine==null) return "null";
        String chainebis="";
        for(int i=0; i<chaine.length(); i++)
        {
            char a;
            a=decaleCaractere(chaine.charAt(i),decalage);
            chainebis=chainebis + a;
        }
        return chainebis;
    }
    
    /**
     * Méthode permettant de chiffrer une chaine de caractère
     */
    public String cypte()
    {
        if(chaine==null) return "null";
        String chainebis="";
        for(int i=0; i<chaine.length(); i++)
        {
            char a;
            a=decaleCaractere(chaine.charAt(i),-decalage);
            chainebis=chainebis + a;
        }
        return chainebis;
    }
    
    private static char decaleCaractere(char c, int decalage)
    {
    return (c < 'A' || c > 'Z')? c : (char)(((c - 'A' + decalage) % 26) + 'A');
    }
}
