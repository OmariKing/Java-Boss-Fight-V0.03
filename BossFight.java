import java.util.*;
public class BossFight 
{
	public static void main(String[] arg)
	{
		Scanner in = new Scanner(System.in);
		String Pl;
		
		System.out.println("Please enter what you would like to name your warrior: ");
		
		Pl = in.nextLine();
		
		System.out.println("Hello " + Pl + ", Get ready for your first fight!");
		int PlHealth = 500;
		int EnHealth = 500;
		
		while (PlHealth >= 0)
		{
			System.out.println(Pl + ": " + PlHealth);
			
			System.out.println("1.Attack");
			
			System.out.println("2.Magic");
			
			System.out.println("3.Defend");
			
			System.out.println("Enemy: " + EnHealth);
			int action;
			Random rdm = new Random();
			int damage;
			int defense;
			int Endamage;
			action = in.nextInt();
			if (action == 1)
			{
				damage = rdm.nextInt(55);
				EnHealth-= damage;
				System.out.print("You did " + damage + " damage!" );
				Endamage = rdm.nextInt(50);
				PlHealth -= Endamage;
				System.out.print("The Enemy did " + Endamage + " damage!" );
			}
			
			if (action == 2)
			{
				damage = rdm.nextInt(85);
				EnHealth-= damage;
				System.out.print("You did " + damage + " damage!" );
				Endamage = rdm.nextInt(80);
				PlHealth -= Endamage;
				System.out.print("The Enemy did " + Endamage + " damage!" );
			}
			
			if (action == 3)
			{
				int knockback;
				defense = rdm.nextInt(55);
				Endamage = rdm.nextInt(50);
				knockback = Endamage - defense;
				
				if(knockback <= 0)
				{
					PlHealth += knockback;
					System.out.println("You took " + knockback + " damage!");
				}
				
				else if(knockback >= 0)
				{
					EnHealth -= knockback;
					System.out.println("Enemy took " + knockback + " damage!");
				}
				
				else if(knockback == 0)
				{
					EnHealth -= knockback;
					System.out.println("You successfully defended!");
				}
			}
			
			if (PlHealth <= 0)
			{
				System.out.println("[G A M E O V E R]");
			}
			
			if (EnHealth <= 0)
			{
				System.out.println("Y O U W I N!");
			}
		}
	}
	
	
}
