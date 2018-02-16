
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
    private ChaineCryptee(String ChaineDeCaractere, int DecalageDesLettres)
    {
        this.chaine=ChaineDeCaractere;
        this.decalage=DecalageDesLettres;
    }
    
    public static ChaineCryptee deEnClair(String C, int d)
    {
        return new ChaineCryptee(C,d);
    }
    
    public static ChaineCryptee deCrypt(String C, int d)
    {
        ChaineCryptee CC=new ChaineCryptee(C,d);
        CC.chiffre();
        return CC;
    }
    
    /**
     * Méthode permettant de déchiffrer une chaine de caractère
     */
    public String dechiffre()
    {
        return chaine;
    }
    
    /**
     * Méthode permettant de chiffrer une chaine de caractère
     */
    public String chiffre()
    {
        if(chaine==null) return "null";
        String chainecryptee="";
        for(int i=0; i<chaine.length(); i++)
        {
            chainecryptee+=decaleCaractere(chaine.charAt(i),decalage);
        }
        chaine=chainecryptee;
        return chainecryptee;
    }
    
    private static char decaleCaractere(char c, int decalage)
    {
    return (c < 'A' || c > 'Z')? c : (char)(((c - 'A' + decalage) % 26) + 'A');
    }
}
