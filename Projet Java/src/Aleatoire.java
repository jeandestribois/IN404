import java.util.Random;

public class Aleatoire
{
		private static int getRandomNumberInRange(int min, int max) {

		Random r = new Random();
		return r.ints(min, (max + 1)).findFirst().getAsInt();
	}
}