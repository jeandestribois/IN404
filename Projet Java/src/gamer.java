import java.util.Scanner;
public class gamer {

    int x;
    int y;
    int life;
    int attack;
  static char gamer_char = '1';
  char solChar = '-';
  char murChar = '#';


    public gamer(char[][]selfie)
    {
      int cpt_gamer = 0;
      int index_gamer = 10;
      this.life = 100;
      this.attack = 20;

          for (int i = 0; i < selfie.length ;i++ ) {
              for (int j = 0;j < selfie[0].length ;j++ ) {
                    if (selfie[i][j] == this.solChar) {
                          if (cpt_gamer  == index_gamer ) {
                              this.x = i;
                              this.y = j;
                          }
                          cpt_gamer++;
                    }
              }
          }

    }


    public char[][] deplacer(String touche, char[][] selfie)
    {

      if (touche.equals("q")) {  // en haut
        if (selfie[this.x][this.y -1] != murChar) {
          this.y -= 1;
          selfie[this.x][this.y] = this.gamer_char;
          selfie[this.x][this.y+1] = this.solChar;

        }
      }
      else if (touche.equals("d")) {  // en bas
        if (selfie[this.x][this.y +1] != murChar) {
          this.y += 1;
          selfie[this.x][this.y] = this.gamer_char;
          selfie[this.x][this.y-1] = this.solChar;
        }
      }
      else if (touche.equals("z")) { // a gauche
        if (selfie[this.x -1][this.y] != murChar ) {
        this.x -= 1;
        selfie[this.x][this.y] = this.gamer_char;
        selfie[this.x+1][this.y] = this.solChar;
      }
      }
      else if (touche.equals("s")) { // a droite
        if (selfie[this.x +1][this.y] != murChar) {
          this.x += 1;
          selfie[this.x][this.y] = this.gamer_char;
          selfie[this.x-1][this.y] = this.solChar;
        }
      }

        return selfie;

    }





}
