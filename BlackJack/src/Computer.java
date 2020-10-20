//All the intilizations for the player 'Computer' will be done here
import java.util.Random;

public class Computer {
	
	Random r1 = new Random();
	
	public int computer_setup()
	{
		return r1.nextInt(11);
	}
	
	public int play()
	{
		return r1.nextInt(10);
	}
	
	public String computer_display()
	{
		return "Computer score is " ;
	}
	

}
