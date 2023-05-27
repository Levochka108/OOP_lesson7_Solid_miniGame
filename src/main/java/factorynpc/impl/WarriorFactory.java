/**
 * @author Dmitrii Klochkov
 * Date:27.05.2023
 * Time:9:30
 */
package factorynpc.impl;

import factorynpc.CharacterFactory;
import model.Character;
import model.character.Warrior;

public class WarriorFactory implements CharacterFactory {

    @Override
    public Character createCharacter(Character typeCharacter) {
        return new Warrior(typeCharacter.getName(), typeCharacter.getHpPoint());
    }
}
