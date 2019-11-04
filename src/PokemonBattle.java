/*
 make a method called battleStart
 	write some greetings
 	ask for user to input pokemon name
 	greet personalized pokemon
 make another method called damage
 	take the parameters of the pokemon name from user input from battleStart
 	asks for base stats (user input)
 	use formula to calculate damage
 	prints out damage and HP values
 	return HP
 make another method called statsTable
 	list out all the stats from battleStart and damage by taking them as parameters
 	prints these out
 
 main method
 	variable = the return value of battleStart
 	another variable = the return value of damage (variable)
 	call statsTable (variable, another variable)
 */


import java.util.*;
public class PokemonBattle {


	public static void main(String[] args) {
		String name = battleStart();
		double new_HP = damage(name);
	}
	
	public static String battleStart() {
		System.out.println("Another trainer is issuing a challenge");
		System.out.println("Zebstrika appeared.");
		System.out.print("Which Pokemon do you choose? ");
		Scanner console = new Scanner (System.in);				/*prompts user input for pokemon name*/
		String name = console.nextLine();						/*stores name into a string for later use*/
		System.out.println("You chose " + name);
		System.out.println("It's a Pokemon battle between " + name + " and Zebstrika! Go!");
		System.out.println();
		return name;
	}
	
	public static double damage(String name) {
		System.out.println("Zebrastika used Thunderbolt!");
		System.out.println();
		System.out.println("Trainer, what are your " + name + "'s stats?");
		
		/*prompts for user input for base stats*/
		System.out.print("Level: ");
		Scanner console = new Scanner (System.in);				/*makes a scanner for all inputs*/
		int level = console.nextInt();							/*stores level as an int*/
		System.out.print("Attack: ");
		double attack = console.nextDouble();					/*stores attack as a double*/
		System.out.print("Defense: ");
		double defense = console.nextDouble();
		System.out.print("Base: ");
		double base = console.nextDouble();
		System.out.print("STAB: ");
		double STAB = console.nextDouble();
		System.out.print("HP: ");
		double HP = console.nextDouble();
		
		/*calculates using those user input values*/
		double modifier = 0.85 + ((1.0 - 0.85)*Math.random());								/*finds a random number between 0.85 and 1.0*/
		double damage = (((2*level+10)/250)+(attack/defense)*base+2) * modifier;			/*formula*/
		System.out.println(name + " sustained " + damage + " points damage.");
		double new_HP = HP - damage;														/*calculates the amount of HP left*/
		System.out.println("HP, after damage, are now " + new_HP);
		return new_HP;
	}
	
	public static void statsTable(String name, double new_HP, double level, double attack, double defense, double sp_atk, double sp_def, double speed) {
		System.out.print("Name" + name);
		
	}

}
