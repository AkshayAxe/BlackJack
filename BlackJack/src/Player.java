import java.util.Random;

public class Player {
	
	private Random r1 = new Random();
	private int player_total =0;
	int amount=100;
	int deal=0;
	public int Amount() {
		return amount;
	}
	
	
	public void player_setup()
	{
		player_total=r1.nextInt(11)+r1.nextInt(11);
	}
	
	public int hit()
	{
		player_total+=r1.nextInt(11);
		return player_total;
	}
	
	public int player_score()
	{
		return player_total;
	}
	
	public String player_display()
	{
		return "Your score is " + player_total;
	}

	public int getPlayer_total() {
		return player_total;
	}

	public void setPlayer_total(int player_total) {
		this.player_total = player_total;
	}

}
