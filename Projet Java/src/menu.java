import java.io.*;
import java.util.Scanner;

public class menu {
      int x;
      int y;
      public menu() {
        this.x = 80;
        this.y = 24;

      }



  public  char [][] aff_menu(menu carnaval) throws IOException {
      char[][] cartoon = null;
        //  1 er ecran
      String param1 = "a: Choisir les niveaux ";
      String param2 = "b: Lancer le generateur aleatoire";
      String param3 = "c: Sourire °_° et afficher les instructions ";
        //
        //   2 eme ecran si touche a
      String param4 = "a: Niveau 1";
      String param8 = "b: Niveau 2";
        //   3 eme ecran si touche c
        //
      String param5 = "1: Pour se de placer : z, s, q, d ";
      String param6 = "2: Les monstres c'est a Jean de faire";
      String param7 = "3: Sourire °_° ";

      Scanner sc = new Scanner(System.in);
      String touche = "";

    for (int i = 0;i < param3.length(); i++ ) {
      System.out.print("-");
    }
    System.out.println("");
    for (int j = 0 ;j<carnaval.y /4 ;j++ ) {
          System.out.println();
      }
      System.out.print(param1);
    for (int j = 0 ;j<carnaval.y /4 ;j++ ) {
            System.out.println();
          }
      System.out.print(param2);
      System.out.println();
    for (int j = 0 ;j<carnaval.y /4 ;j++ ) {
            System.out.println();

      }
      System.out.print(param3);
      System.out.println();
    for (int j = 0 ;j<carnaval.y /4 ;j++ ) {
          System.out.println();

    }
    for (int i = 0;i < param3.length() ; i++ ) {
      System.out.print("-");
    }
      System.out.println("");
      //
      //demande   apres premier affichage
      //
      //touche = sc.nextLine();
          //
          //  pour sortir du menu direct et commencer une partie aleatoire tap : next
          //
          while (!touche.equals("p")) {
            touche = sc.nextLine();


         if (touche.equals("a")) {
              ecran.clearScreen();
           for (int i = 0;i < param3.length(); i++ ) {
             System.out.print("-");
           }
           System.out.println("");
           for (int j = 0 ;j<carnaval.y /4 ;j++ ) {
             System.out.println();
           }

           System.out.print(param4);
           for (int j = 0 ;j<carnaval.y /4 ;j++ ) {
             System.out.println();
           }
          System.out.println(param8);
           System.out.println();
           for (int j = 0 ;j<carnaval.y /4 ;j++ ) {
             System.out.println();

           }

           System.out.println();
           for (int j = 0 ;j<carnaval.y /4 ;j++ ) {
             System.out.println();

           }
           for (int i = 0;i < param3.length(); i++ ) {
             System.out.print("-");
           }
           System.out.println("");

           touche = sc.nextLine();
           if (touche.equals("a"))
           {

             return fichier.niveau("niv1.txt");
           }
           if (touche.equals("b")) {
              return fichier.niveau("niv2.txt");
           }

         }

         else if (touche.equals("b"))
         {

             return map.generator(10,10,1);
           }

        else if (touche.equals("c")) {
          ecran.clearScreen();
          for (int i = 0;i < param3.length(); i++ ) {
            System.out.print("-");
          }
          System.out.println("");
          for (int j = 0 ;j<carnaval.y /4 ;j++ ) {
            System.out.println();
          }
          System.out.print(param5);
          for (int j = 0 ;j<carnaval.y /4 ;j++ ) {
            System.out.println();
          }
          System.out.print(param6);
          System.out.println();
          for (int j = 0 ;j<carnaval.y /4 ;j++ ) {
            System.out.println();

          }
          System.out.print(param7);
          System.out.println();
          for (int j = 0 ;j<carnaval.y /4 ;j++ ) {
            System.out.println();

          }
          for (int i = 0;i < param3.length() ; i++ ) {
            System.out.print("-");
          }
          System.out.println();
          System.out.println("Appuyer sur p et continuer ver le generateur aleatoire");
          System.out.println("");

        }


      }


      return map.generator(10,10,1);

    }
  }
