import java.util.*;
public class BlackJack {
	

	public static void main(String[] args) {
		//Code for the game
		Player player = new Player();
		Computer computer = new Computer();
		Scanner in = new Scanner(System.in);
		System.out.println("Press 1 to start the game!!! ");
		int after_game=0;
		
		int n = in.nextInt();
		int again=1;
		while(again==1) {
		
		if(n==1) 
		{
		System.out.println("You have $"+ player.Amount()+ " place your bet within the amount you have");
		int bet = in.nextInt();
		int computer_total = 0;
		player.player_setup();
		if(player.getPlayer_total()==21)
		{
			System.out.println("BLACKJACK You Won!!!");
			System.out.println(player.player_display());
			System.out.println(computer.computer_display() + computer_total);
			after_game=player.Amount()+bet;
			System.out.println("you current amount is "+ after_game);
			return;
		}
		computer_total=computer.computer_setup();
		System.out.println(player.player_display());
		System.out.println(computer.computer_display() + computer_total);
		System.out.println("Choose options  1) Hit            2) Stand");
		
		int input= 0;
		while(input!=2)
		{
			System.out.println("Choose now....");
			input=in.nextInt();
			if(input==1)
			{
				System.out.println("You chose to hit");
				player.hit();
				if(player.getPlayer_total()==21)
				{
					System.out.println("BLACKJACK You Won!!!");
					System.out.println(player.player_display());
					System.out.println(computer.computer_display() + computer_total);
					after_game=player.Amount()+bet;
					System.out.println("you current amount is "+ after_game);
					return;
				}
				System.out.println(player.player_display());
			}
			else if(input!=2)
			{
				System.out.println("Wrong input. Try Again.");
			}
			
			if(player.getPlayer_total()>21)
			{
				System.out.println("You are BURST!!! Better luck next time.");
				System.out.println(player.player_display());
				System.out.println(computer.computer_display() + computer_total);
				after_game=player.Amount()-bet;
				System.out.println("you current amount is "+ after_game);
				return; 
			}
		}
		
		System.out.println("You choose to stand");
		while(computer_total <21)
		{
			if(computer_total>player.getPlayer_total())
			{
				System.out.println("You lose!!!! Dealer greater than you. Try again.");
				System.out.println(player.player_display());
				System.out.println(computer.computer_display() + computer_total);
				after_game=player.Amount()-bet;
				System.out.println("you current amount is "+ after_game);
				return;
			}
			
			computer_total+=computer.play();
			if(computer_total>=18)
			{
				Random r = new Random();
				if(r.nextInt()%2==1)
				{
					computer_total+=computer.play();
				}
				
			}
			if(computer_total==21)
			{
				
				System.out.println("BLACKJACK You lose!!! Dealer Won!!!");
				System.out.println(player.player_display());
				System.out.println(computer.computer_display() + computer_total);
				after_game=player.Amount()-bet;
				System.out.println("your current amount is "+ after_game);
				return;
			}
		}
		
		System.out.println("You won!!!! Dealer Busted.");
		System.out.println(player.player_display());
		System.out.println(computer.computer_display() + computer_total);
		after_game=player.Amount()+bet;
		System.out.println("you current amount is "+ after_game);
		return;
		
		}
		
		
		}

	}
	
	

}
