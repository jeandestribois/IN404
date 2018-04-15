import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class map {

      char solChar  = '-';
      char murChar  = '#';
      char videChar = ' ';





  private static enum Relation
   {haut,bas,gauche,droite,vide,debut;}

   public static char[][] generator(int xchambre, int ychambre, int taillechambre)
{    char solChar  = '-';
     char murChar  = '#';

     if (xchambre * ychambre * taillechambre == 0) {
         System.out.println("les chambres sont d'une taille 0 car une de constantes est a 0");
     }

     boolean [][] connection = new boolean[xchambre][ychambre];
     Relation [][] voisin = new Relation[xchambre][ychambre];
     // on remet a 0 et sans connections

     for (int i = 0;i < voisin.length ; i ++ ) {
         for (int j = 0;j < voisin[i].length ; j++ ) {
             connection[i][j] = false;
             voisin[i][j]   = Relation.vide;
         }
     }

     List<Integer> chambresRest = new ArrayList<Integer>();
     for (int i = 0;i < xchambre * ychambre ; i ++) {
           chambresRest.add(i);
     }


     Random choix = new Random();

    int debutX = choix.nextInt(xchambre);
 		int debutY = choix.nextInt(ychambre);
 		connection[debutX][debutY] = true;
 		voisin[debutX][debutY] = Relation.debut;

   while(!chambresRest.isEmpty())
   {
       Random choix2 = new Random();

       int chambreListe = choix2.nextInt(chambresRest.size());
       int chambreIndex = chambresRest.get(chambreListe);
       int[] chambre = new int [] {chambreIndex / xchambre , chambreIndex % ychambre};

       if (connection[chambre[0]][chambre[1]]) {

           chambresRest.remove(chambreListe);




       }
       else
       {
         final Relation[] ordreRandom = Relation.values();
         Collections.shuffle(Arrays.asList(ordreRandom));

           for (Relation i : ordreRandom) {

           switch(i)
           {
               case haut   :
                               if (chambre[1] != 0 && connection[chambre[0]][chambre[1] - 1]) {
                                     connection[chambre[0]][chambre[1]] = true;
                                     voisin[chambre[0]][chambre[1]]     = Relation.haut;
                             }
                     break;
               case bas    :   if (chambre[1] != ychambre - 1 && connection[chambre[0]][chambre[1] + 1]) {
                                     connection[chambre[0]][chambre[1]] = true;
                                     voisin[chambre[0]][chambre[1]]  = Relation.bas;
                             }
                     break;
               case gauche :   if (chambre[0] != 0 && connection[chambre[0] - 1][chambre[1]]) {
                                     connection[chambre[0]][chambre[1]] = true;
                                     voisin[chambre[0]][chambre[1]]     = Relation.gauche;
                             }
                     break;
               case droite :   if (chambre[0] != xchambre - 1 && connection[chambre[0] + 1][chambre[1]]) {
                                     connection[chambre[0]][chambre[1]] = true;
                                     voisin[chambre[0]][chambre[1]]  = Relation.droite;
                             }

                     break;
               default:
                     break;


           }



       }


   }



 }


 char[][] carte = new char[xchambre * taillechambre + xchambre + 1][ychambre * taillechambre + ychambre + 1];

 for (int i = 0; i < carte.length; i++) {
   for (int j = 0; j < carte[i].length; j++) {
     carte[i][j] = solChar;
   }
 }





 for (int i= 0; i< carte.length; i+= taillechambre + 1) {
   for (int j = 0; j < carte[i].length; j++) {
     carte[i][j] = murChar;
   }
 }
 for (int i= 0; i< carte.length; i++) {
   for (int j = 0; j < carte[i].length; j += taillechambre + 1) {
     carte[i][j] = murChar;
   }
 }

 for (int x = 0; x < voisin.length; x++) {
   for (int y = 0; y < voisin[x].length; y++) {
     switch (voisin[x][y]) {
       case haut:
         int dx = x * (taillechambre + 1);
         int dy = y * (taillechambre + 1);

           carte[dx + 1 + choix.nextInt(taillechambre)][dy] = solChar;


         break;
       case gauche:
         dx = x * (taillechambre + 1);
         dy = y * (taillechambre + 1);

           carte[dx][dy + 1 + choix.nextInt(taillechambre)] = solChar;

         break;
       case droite:
         dx = (x + 1) * (taillechambre + 1);
         dy = (y) * (taillechambre + 1);

           carte[dx][dy + 1 + choix.nextInt(taillechambre)] = solChar;

         break;
       case bas:
         dx = (x) * (taillechambre + 1);
         dy = (y + 1) * (taillechambre + 1);

           carte[dx + 1 + choix.nextInt(taillechambre)][dy] = solChar;




       default:
     }
   }
 }


 return carte;
}



}
