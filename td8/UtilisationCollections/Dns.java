import java.util.ArrayList;
import java.io.*;

public class Dns
{
	private String nomFichier;
	private ArrayList<DnsItem> listItem;

	public Dns(String nomFichier)
	{
		this.nomFichier = nomFichier;
		this.listItem = chargement(nomFichier);
	}

	private ArrayList<DnsItem> chargement(String nomFichier)
	{
		try
		{
			int c;
			String machine="";
			String adr="";
			ArrayList<DnsItem> listItem = new ArrayList<DnsItem>();
			FileReader fichier = new FileReader(nomFichier);
			c=fichier.read();
			while(c!=-1)
			{
				while(c!=' ')
				{
					machine=machine + c;
					c=fichier.read();
				}
				c=fichier.read();
				while(c!='\n')
				{
					adr=adr + c;
					c=fichier.read();
				}
				listItem.add(new DnsItem(new NomMachine(machine),new AdresseIP(adr)));
				c=fichier.read();
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("le fichier " + nomFichier + " n'a pas été trouvé");
		}
		catch(IOException e)
		{
			System.out.println("probleme rencontré lors de la lecture du fichier");
		}
		return listItem;
	}

	public void getItems()
	{
		for(int i=0; i<this.listItem.size(); i++)
		{
			System.out.println("%s %s",listItem.get(i).NomMachine.get());
		}
	}
}