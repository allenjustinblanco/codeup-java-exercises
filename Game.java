import java.util.Scanner;

public class Game {
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    System.out.print("Welcome to AdventureLand!\n");
    System.out.print("-------------------------\n");
    System.out.print("Would you like to start your Adventure?\n");
    boolean userAccept = true;
    String answer = scan.next();
    while(userAccept){
      if(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")){
        userAccept = false;
      } else {

      }
    }

    System.out.print("Name your Hero\n");
    String heroName = scan.next();
    System.out.print("the adventure awaits...\n");
    System.out.print("Choose your weapon!!\n");
    System.out.print("1.Valerian Steel Sword\n2.Draconic Sword\n3.Stick\n4.Diamond Pickaxe\n");
    String weapon = "";
    boolean stop = true;
    int chosenWeapon = scan.nextInt();
    while(stop){
      switch(chosenWeapon){
        case 1:
        System.out.print("Your weapon is the Valerian Steel Sword!\n");
        weapon = "Valerian Steel Sword";
        stop = false;
        break;
        case 2:
        System.out.print("Your weapon is the Draconic Sword!\n");
        weapon = "Draconic Sword";
        stop = false;
        break;
        case 3:
        System.out.print("Your weapon is the Stick!\n");
        weapon = "Stick";
        stop = false;
        break;
        case 4:
        System.out.print("Your weapon is the Diamond Pickaxe!\n");
        weapon = "Diamond Pickaxe";
        stop = false;
        break;
      }
    }
    System.out.format("%s's Stats - \n", heroName);
    System.out.print("-------------\n");
    int userHealth = 200;
    int userAttack = 10;
    int amountOfPotions = 5;
    int drinkPotion = 10;
    int dragonHealth = 1000;
    int dragonAttack = 20;
    System.out.format("Attack: %s\n", userAttack);
    System.out.format("Health: %s\n", userHealth);
    System.out.format("Attack: %s\n", userAttack);
    System.out.format("Inventory-\n  Potions: %s\n  Weapon: %s\n", amountOfPotions, weapon);
    System.out.print("Are you ready?");
    String start = scan.next();
    System.out.format("Greetings, %s!\n", heroName);
    System.out.print("You were skipping through the sleepy forest and you stumble upon a slumbering Dragon...\n");
    System.out.print("What do you do?\n");
    int attack = -10;
    String skipAway = "";
    System.out.print("Select 1 or 2\n1. attack\n2. skip away\n");
    int decision = scan.nextInt();
    boolean action = true;
    while(action){
      switch(decision){
        case 1:
        System.out.print("You rush in to attack and pierce the dragons eye!\n");
        action = false;
        break;
        case 2:
        System.out.print("You skip away but the dragon hears the noise and Attacks you from behind. You lose 100 health\n");
        action = false;
        break;
      }
    }
  }
}

// Console Adventure Game!
// Today you’ll be pairing up with a sidekick to go on a little adventure in Java.
// You’ll be creating a text based RPG in your console!
// –	Allow user to input their hero name.
// –	Ask if they are ready to start. If yes, then start the game.
// –	Give a display of enemy stats and hero stats. These values can be assigned by you.
// –	Decide on what actions your hero can take.
// –	For example:
// 1.	Attack (each time 1 is input, enemy health should decrease)
// 2.	Drink potion (adds to hero health.)
// 3.	Run? (ends the game)
// –	Keep asking for user input until the enemy health reaches 0, then end the game.
// **BONUS:
// –	allow user to input enemy name.
// –	have the enemy attack the hero to decrease heroHealth after each time the hero takes an action
// –	if heroHealth reaches 0 before the enemy’s end game with message “Game Over.”
// –	Indicate how many potions your hero starts with. Decrement each time this action is used.
// ~ Have fun and get creative!
//
