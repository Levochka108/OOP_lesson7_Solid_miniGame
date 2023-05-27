/**
 * @author Dmitrii Klochkov
 * Date:27.05.2023
 * Time:12:08
 */
package factorynpc.impl;

import factorynpc.CharacterFactory;
import model.Character;
import model.character.Paladin;

public class PaladinFactory implements CharacterFactory {
    @Override
    public Character createCharacter(Character typeCharacter) {
        return new Paladin(typeCharacter.getName(), typeCharacter.getHpPoint());
    }
}
