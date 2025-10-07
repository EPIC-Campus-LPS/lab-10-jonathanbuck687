package Mountain_Climber;

public class MountainClimber {
	private Mountain[] wantToClimb;
	public MountainClimber(Mountain[] w)
	{
		wantToClimb = w;
	}
	public Mountain[] getWantToClimb()
	{
		return wantToClimb;
	}
	public void setWantToClimb(Mountain[] w)
	{
		wantToClimb = w;
	}
	public String mostDifficultClimb()
	{
		int index = 0;
		double mostDifficult = -1;
		for (int i = 0; i < wantToClimb.length; i++)
		{
			if (wantToClimb[i].getClimbDifficulty() > mostDifficult)
			{
				mostDifficult = wantToClimb[i].getClimbDifficulty();
				index = i;
			}
		}
		return wantToClimb[index].getName();
	}
	public void sortClimbLowToHigh() 
	{
		Mountain temp;

		for (int i = 0; i < wantToClimb.length; i++)
		{
			for (int j = 0; j < wantToClimb.length - i - 2; j++)
			{
				if (wantToClimb[j].getClimbDifficulty() > wantToClimb[j + 1].getClimbDifficulty())
				{
					temp = wantToClimb[j];
					wantToClimb[j] = wantToClimb[j + 1];
					wantToClimb[j + 1] = temp;

				}
			}
		}
	}
	public void sortClimbHighToLow() 
	{
		Mountain temp;

		for (int i = 0; i < wantToClimb.length; i++)
		{

			for (int j = 0; j < wantToClimb.length - i - 2; j++)
			{
				if (wantToClimb[j].getClimbDifficulty() < wantToClimb[j + 1].getClimbDifficulty())
				{
					temp = wantToClimb[j];
					wantToClimb[j] = wantToClimb[j + 1];
					wantToClimb[j + 1] = temp;
				}
			}
		}
	}
	public MountainClimber getFourteeners()
	{
		Mountain[] cronountan = new Mountain[wantToClimb.length];
		for (int i = 0; i < wantToClimb.length; i++)
		{
			if (wantToClimb[i].getElevation() >= 14000)
			{
				cronountan[i] = wantToClimb[i];
			}
		}
		MountainClimber fountainHeimer = new MountainClimber(cronountan);
		return fountainHeimer;
	}
	public String toString()
	{
		String cheese = "";
		cheese += "MountainClimber{";
		for (int k = 0; k < wantToClimb.length; k++)
		{
			cheese += wantToClimb.toString();
			cheese += ",";
		}
		cheese += "}";
		return cheese;

	}
	
}
