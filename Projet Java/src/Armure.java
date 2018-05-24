public class Armure
{
	private int resistance;

	public Armure()
	{
		this.resistance=0;
	}

	public int getResistance()
	{
		return this.resistance;
	}

	public void augmenteResistance(int aug)
	{
		this.resistance+=aug;
	}
}