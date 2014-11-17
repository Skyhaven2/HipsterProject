package ctec.hipster.model;

public class Hipster
{

	private String name;
	private int age;
	private String [] hipsterAlbums;
	
	public Hipster(String name, int age)
	{
		name = "";
		age = -99;
		hipsterAlbums = null;
	}
	
	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}

	public String[] getHipsterAlbums()
	{
		return hipsterAlbums;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public void setHipsterAlbums(String[] hipsterAlbums)
	{
		this.hipsterAlbums = hipsterAlbums;
	}

	
}
