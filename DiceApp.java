
public class DiceApp {

	public static void main(String[] args) {
		
		int roll;
		String msg = "Here are 100 random rolls of the dice:";
		System.out.println(msg);
		for (int i = 0; i <100; i++) //Sets conditions
		
		{
			roll = randomInt(1, 6); //Program chooses a number from 1-6
			System.out.print(roll + " "); 
		}
			System.out.println();
	}
			public static int randomInt(int low, int high) //Declares, returns, and accepts two ints
			{
				int result = (int)(Math.random() //Converts random double between low and high
				* (high - low + 11)) + low;
				return result; //Returns result to randomInt method
			}
}
