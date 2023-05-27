/**
 * @author Dmitrii Klochkov
 * Date:27.05.2023
 * Time:11:13
 */
package view;

import factorynpc.CharacterFactory;
import factorynpc.impl.*;
import model.Character;
import model.character.*;
import model.nps.Monster;
import view.map.StartBattle;

import java.util.Scanner;

public class ViewWorkingConstructor implements InfantryBarracks, DivineTemple , StartBattle {
    Character monsterBoss = new Monster("Boss Monster",200,15);
    CharacterFactory characterFactory;
    Scanner scanner = new Scanner(System.in);

    @Override
    public void createInfantryBarracks() {
        System.out.println("Infantry Barracks is done!");
        System.out.println("Which character do you want to create? (1 - Warrior, 2 - Hunter, 3 - Rogue)");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                characterFactory = new WarriorFactory();
                Character warrior = characterFactory.createCharacter(new Warrior("Strong Warrior", 100,10));
                System.out.println(warrior);
                battle(warrior, (Monster) monsterBoss);

            }
            case 2 -> {
                characterFactory = new HunterFactory();
                Character hunter = characterFactory.createCharacter(new Hunter("Hunter", 100,12));
                System.out.println(hunter);
            }
            case 3 ->{
                characterFactory = new RogueFactory();
                Character rogue = characterFactory.createCharacter(new Rogue("Rogue", 100,11));
                System.out.println(rogue);
            }
            default ->
                System.out.println("Invalid choice. No character created.");
        }
    }

    @Override
    public void createDivineTemple() {
        System.out.println("Divide Temple is done!");
        System.out.println("Which character do you want to create? (1 - Magic Paladin, 2 - Mage)");

        int choice = scanner.nextInt();
        switch (choice){
            case 1 -> {
                characterFactory = new PaladinFactory();
                Character paladin = characterFactory.createCharacter(new Paladin("Magic Paladin", 120, 14));
                System.out.println(paladin);
            }
            case 2 ->{
                characterFactory = new MageFactory();
                Character mage = characterFactory.createCharacter(new Mage("Mage", 100,10));
                System.out.println(mage);
            }
            default ->
                    System.out.println("Invalid choice. No character created.");
        }

    }

    @Override
    public void battle(Character character, Monster monsterBoss) {
        System.out.println("The battle begins!");
        System.out.println("Select an action: (1 - Attack, 2 - Defence, 3 - Exit)");
        int choice = scanner.nextInt();
        switch (choice){
            case 1 ->{
                character.attack(monsterBoss);

                monsterBoss.attack(character);

                battle(character, monsterBoss);
            }
            case 2 ->{
                character.defence();
                monsterBoss.attack(character);
            ;
                battle(character, monsterBoss);
            }
            case 3 ->{
                break;
            }
        }
    }
}
