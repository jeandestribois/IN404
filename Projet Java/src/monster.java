
public class monster {

	int x;
	int y;
	int attack = 10;
	int health = 100;
	static char  monster_char = 'M';

	public monster(int longueur, int hauteur) {
		this.x = longueur;
		this.y = hauteur;
	}
	public  monster()
	{
		this.x = 18;
		this.y = 18;
	}
}