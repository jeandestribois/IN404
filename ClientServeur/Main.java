import in404.exo61.serveur.Serveur;
import in404.exo61.client.Client;

public class Main
{
    public static void Main()
    {
        Serveur s=new Serveur();
        Client c1=new Client("c1");
        Client c2=new Client("c2");
        Client c3=new Client("c3");
        
        c1.seConnecter(s);
        c2.seConnecter(s);
        c3.seConnecter(s);
        
        c3.envoyerMessage("Bonjour");
        
    }
}
