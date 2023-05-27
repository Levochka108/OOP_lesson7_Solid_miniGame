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

import java.util.Scanner;

public class ViewWorkingConstructor implements InfantryBarracks, DivineTemple {
    CharacterFactory characterFactory;
    Scanner scanner = new Scanner(System.in);

    @Override
    public void createInfantryBarracks() {
        System.out.println("Infantry Barracks is done!");
        System.out.println("Which character do you want to create? (1 - Warrior, 2 - Hunter, 3 - Rogue)");

        int choise = scanner.nextInt();
        switch (choise) {
            case 1 -> {
                characterFactory = new WarriorFactory();
                Character warrior = characterFactory.createCharacter(new Warrior("Strong Warrior", 100));
                System.out.println(warrior);

            }
            case 2 -> {
                characterFactory = new HunterFactory();
                Character hunter = characterFactory.createCharacter(new Hunter("Hunter", 100));
                System.out.println(hunter);
            }
            case 3 ->{
                characterFactory = new RogueFactory();
                Character rogue = characterFactory.createCharacter(new Rogue("Rogue", 100));
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
                Character paladin = characterFactory.createCharacter(new Paladin("Magic Paladin", 120));
                System.out.println(paladin);
            }
            case 2 ->{
                characterFactory = new MageFactory();
                Character mage = characterFactory.createCharacter(new Mage("Mage", 100));
                System.out.println(mage);
            }
            default ->
                    System.out.println("Invalid choice. No character created.");
        }

    }
}
