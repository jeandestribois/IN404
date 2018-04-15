public class ecran{
      int x;
      int y;

      public char [][] ecran(char [][]map){

        this.x = map.length;
        this.y = map[0].length;

              return map;

      }

      public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
      }

      public  static void init_game (char [][]carte,gamer j1, monster m1){
        char solChar  = '-';

          for (int y = 0; y < carte[0].length; y++) {
            for (int x = 0; x < carte.length; x++) {
              if (carte[x][y] == solChar && x == j1.x && y == j1.y) {
                  carte[x][y] = gamer.gamer_char;
              }


            }

          }
    }



    public static void  afficher_map(char [][] map)
    {
      for (int x = 0; x < map.length; x++) {
        for (int y = 0; y < map[0].length; y++) {
          System.out.print(map[x][y]);
        }
        System.out.println();
      }

    }

    }
