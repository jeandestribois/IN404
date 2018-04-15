import java.util.Scanner;
import java.io.*;

public class main{

  public static void main(String[] args)  throws IOException {
    Scanner scan = new Scanner(System.in);
    menu VALD = new menu();




      System.out.println("POUR quiter tapper la lettre p °_° ");
      System.out.println("POUR commencer tapper entree  °_° ");
      String  scanString = "";





      scanString = scan.nextLine();

      System.out.println("touche "+scanString);


      char[][]  mapp = VALD.aff_menu(VALD);


      gamer j1 = new gamer(mapp);
      monster m1 = new monster();

      ecran.init_game(mapp,j1,m1);
            ecran.clearScreen();
            
        ecran.afficher_map(mapp);
    while (!scanString.equals("p"))
    {
       scanString = scan.nextLine();
        ecran.clearScreen();

        mapp =  j1.deplacer(scanString,mapp);
        ecran.afficher_map(mapp);
        System.out.println("JOUER x:" + j1.y + " y: " +j1.x);

    }
          ecran.clearScreen();
          System.out.println("VOUS ETES SORTI DU JEU");




}
}
