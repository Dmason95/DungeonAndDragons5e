package DungeonAndDragons.weapons;

public class Longsword implements Wieldable
{
	private String damageDie = "1d8";
	private String damageType = "Slashing";
	private int weight = 3;
	private String properties = "Versatile (1d10)";
	
	public Longsword()
	{
		
	}
	
	public String getDamageDie()
	{
		return this.damageDie;
	}
	
	public String getDamageType()
	{
		return this.damageType;
	}
	
	public int getWeight()
	{
		return this.weight;
	}
	
	public String getProperties()
	{
		return this.properties;
	}
}