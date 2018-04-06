import java.io.*;

public class main
{
	public static void main(String[] fileName)
	{
		try
		{
			FileReader file = new FileReader(fileName[0]);
			int compteur=0;
			int c = file.read();
			while(c != -1)
			{
				if(c == '\n') compteur++;
				c = file.read();
			}
			compteur ++;
			System.out.println("le fichier est composé de " + compteur + " lignes");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("le fichier " + fileName + " n'a pas été trouvé");
		}
		catch(IOException e)
		{
			System.out.println("probleme rencontré lors de la lecture du fichier");
		}
	}
}