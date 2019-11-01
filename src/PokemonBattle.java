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
		battleStart();

	}
	
	public static String battleStart() {
		System.out.println("Another trainer is issuing a challenge");
		System.out.println("Zebstrika appeared.");
		System.out.println("Which Pokemon do you choose?");
		Scanner console = new Scanner (System.in);
		String name = console.nextLine();
		System.out.println("You chose " + name);
		System.out.println("It's a Pokemon battle between " + name + " and Zebstrika! Go!");
		return name;
	}

}
