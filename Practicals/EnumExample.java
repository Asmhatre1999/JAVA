


enum Directions
{
	EAST,
	WEST,
	NORTH,
	SOUTH;

}

public class EnumExample {

	Directions direction;
	public EnumExample(Directions direction)
	{
		this.direction=direction;
	}
	
	void checkDirections()
	{
		switch(direction)
		{
			case EAST:System.out.println("Direction is EAST");
				break;
			case WEST:System.out.println("Direction is WEST");
				break;
			case NORTH:System.out.println("Direction is NORTH");
				break;
			case SOUTH:System.out.println("Direction is SOUTH");
				break;
			default:System.out.println("Check direction");
			
		}
	}

	public static void main(String[] args) {

		String str="SOUTH";
		EnumExample e = new EnumExample(Directions.valueOf(str));
		e.checkDirection();
	}
}