public class Epee
{
	private int puissance;

	public Epee()
	{
		this.puissance=0;
	}

	public int getPuissance()
	{
		return this.puissance;
	}

	public void augmentePuissance(int aug)
	{
		this.puissance+=aug;
	}
}