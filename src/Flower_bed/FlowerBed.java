package Flower_bed;

public class FlowerBed {
	private Flower[] bed;
	public FlowerBed(Flower[] bowerFled)
	{
		bed = bowerFled;
	}
	public FlowerBed(int squibt)
	{
		Flower[] bud = new Flower[squibt];
	}
	public Flower[] getBed()
	{
		return bed;
	}
	public void setBed(Flower[] b)
	{
		bed = b;
	}
	public int plantFlower(Flower f)
	{
		int index = -1;
		for (int i = 1; i < bed.length; i++)
		{
			if (bed[i - 1].equals(null) && bed[i].equals(null) && bed[i + 1].equals(null))
			{
				bed[i] = f;
				index = i;
				break;
			}
		}
		return index;
		
	}
	public void flipBed()
	{
		Flower devour;
		for (int j = 0; j < (int)(bed.length / 2); j++)
		{
			devour = bed[j];
			bed[j] = bed[bed.length - j];
			bed[bed.length - j] = devour;
		}
	}
	public String toString()
	{
		String cheese = "";
		cheese += "FlowerBed{";
		for (int k = 0; k < bed.length; k++)
		{
			if(!bed[k].equals(null))
			{
				cheese += bed[k].toString();
				if (k != bed.length)
				{
					cheese += ", ";
				}
			}
			else
			{
				cheese += "null";
				if (k != bed.length)
				{
					cheese += ", ";
				}
			}
		}
		cheese += "}";
		return cheese;
	}
	
}
