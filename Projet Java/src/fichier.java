import java.io.*;
import java.util.*;

public class  fichier  {

  public  fichier()
  {


  }




    public static char[][] niveau(String text) throws IOException
    {
          LineNumberReader file = new LineNumberReader(new InputStreamReader(
          new FileInputStream(text)));
          ArrayList<String> liste = new ArrayList<String>();
      try {
        String ligne;
          while ((ligne = file.readLine())!=null) {
              liste.add(ligne);
          }

            System.out.println("liste size              :"+liste.size());


      }finally
      {
          file.close();
        }
            String[] tab = liste.toArray(new String[liste.size()]);
            int f = Integer.parseInt(tab[liste.size()-1]);
            System.out.println("liste size int , map y :"+f);
            System.out.println("tab lenght       map x : "+tab.length);

            char[][] map = new char[tab.length -1][f];
            for (int i = 0;i < tab.length - 1 ; i++ ) {
              for (int j = 0;j <  f;j++ ) {
                map[i][j] = tab[i].charAt(j);
                System.out.print(map[i][j]);

              }
                System.out.println();
            }
            return map;

          }
        }
