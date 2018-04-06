import java.io.*;

public class main
{
	public static void main(String[] fileName)
	{
		//try
		//{
			if(fileName[0] == "--help")
			{
				System.out.println("grep permet de faire des recherches dans un fichier");
				System.out.println("les commandes possible sont :");
				System.out.println("-e	->	utiliser MOTIF comme expression rationnelle");
				System.out.println("-f	->	charger le MOTIF depuis ce FICHIER");
				System.out.println("-n	->	afficher le numéro de ligne avec la sortie");
				System.out.println("-i	->	ignorer la distinction de la casse");
				System.out.println("MOTIf est la chaine recherché et FICHIER est le fichier en question");
				System.out.println("par exemple : java grep -i 'Bonjour tout le monde' main.java");
			}
			if(fileName[0] == "-e")
			{
				
			}
			if(fileName[0] == "-f")
			{
				
			}
			if(fileName[0] == "-n")
			{
				
			}
			if(fileName[0] == "-i")
			{
				
			}
		//}
		/*
		catch(FileNotFoundException e)
		{
			System.out.println("le fichier " + fileName + " n'a pas été trouvé");
		}
		catch(IOException e)
		{
			System.out.println("probleme rencontré lors de la lecture du fichier");
		}
		*/
	}
}