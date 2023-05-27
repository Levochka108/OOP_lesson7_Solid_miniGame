/**
 * @author Dmitrii Klochkov
 * Date:27.05.2023
 * Time:11:13
 */
package view;

import factorynpc.*;
import factorynpc.impl.*;
import model.Character;
import model.character.*;

public class ViewWorkingConstructor implements InfantryBarracks, DivineTemple {
    CharacterFactory characterFactory;


    @Override
    public void createInfantryBarracks() {
        System.out.println("Infantry Barracks is done!");

        characterFactory = new WarriorFactory();
        Character warrior = characterFactory.createCharacter(new Warrior("Strong Warrior", 100));
        System.out.println(warrior);

        characterFactory = new HunterFactory();
        Character hunter = characterFactory.createCharacter(new Hunter("Hunter", 100));
        System.out.println(hunter);

        characterFactory = new RogueFactory();
        Character rogue = characterFactory.createCharacter(new Rogue("Rogue", 100));
        System.out.println(rogue);
    }

    @Override
    public void createDivineTemple() {
        System.out.println("Divide Temple is done!");

        characterFactory = new PaladinFactory();
        Character paladin = characterFactory.createCharacter(new Paladin("Magic Paladin", 120));
        System.out.println(paladin);

        characterFactory = new MageFactory();
        Character mage = characterFactory.createCharacter(new Mage("Mage", 100));
        System.out.println(mage);

    }
}
