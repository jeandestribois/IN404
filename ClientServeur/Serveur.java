import java.util.ArrayList;

public class Serveur
{
    private ArrayList<Client> listeClient;
    
    public Serveur()
    {
        this.listeClient=new ArrayList();
    }
    
    public boolean connecter(Client client)
    {
       this.listeClient.add(client);
       return true;
    }
    
    public void diffuserMessage(String message)
    {
        for(int i=0; i<this.listeClient.size(); i++)
        {
            this.listeClient.get(i).recevoirMessage(message);
        }
    }
}
