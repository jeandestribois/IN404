package in404.exo61.client;

import in404.exo61.serveur.Serveur;
import java.util.ArrayList;

public class Client
{
    private String nom;
    private Serveur serveur;
    
    /**
     * Constructeur d'objets de classe Client
     */
    public Client(String nom)
    {
        this.nom = nom;
        this.serveur = new Serveur();
    }
    /**
     * Méthode permettant de connecter le client au serveur
     */
    public boolean seConnecter(Serveur serveur)
    {
        serveur.connecter(this);
        this.serveur=serveur;
        return true;
    }
    
    public void envoyerMessage(String message)
    {
        this.serveur.diffuserMessage(message);
    }
    
    public void recevoirMessage(String message)
    {
        System.out.println(this.nom + " a reçu " + message);
    }
    
}
