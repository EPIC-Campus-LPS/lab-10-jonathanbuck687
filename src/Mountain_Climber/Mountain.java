package Mountain_Climber;

public class Mountain {
	private String name;
	private int elevation;
	private double climbDifficulty;
	public Mountain(String n, int e, double cd)
	{
		name = n;
		elevation = e;
		climbDifficulty = cd;
	}
	public String getName()
	{
		return name;
	}
	public int getElevation()
	{
		return elevation;
	}
	public double getClimbDifficulty()
	{
		return climbDifficulty;
	}
	public void setName(String n)
	{
		name = n;
	}
	public void setElevation(int e)
	{
		elevation = e;
	}
	public void setClimbDifficulty(double cd)
	{
		climbDifficulty = cd;
	}
	public String toString()
	{
		return ("Mountain{" + name + "," + elevation + "," + climbDifficulty + "}");
	}
}
