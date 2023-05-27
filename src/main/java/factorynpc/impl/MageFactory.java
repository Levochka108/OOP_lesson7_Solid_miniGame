/**
 * @author Dmitrii Klochkov
 * Date:27.05.2023
 * Time:9:35
 */
package factorynpc.impl;

import factorynpc.CharacterFactory;
import model.Character;
import model.character.Mage;

public class MageFactory implements CharacterFactory {
    @Override
    public Character createCharacter(Character typeCharacter) {
        return new Mage(typeCharacter.getName(), typeCharacter.getHpPoint());
    }
}
