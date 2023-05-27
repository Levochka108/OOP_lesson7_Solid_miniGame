/**
 * @author Dmitrii Klochkov
 * Date:27.05.2023
 * Time:9:36
 */
package factorynpc.impl;

import factorynpc.CharacterFactory;
import model.Character;
import model.character.Rogue;

public class RogueFactory implements CharacterFactory {
    @Override
    public Character createCharacter(Character typeCharacter) {
        return new Rogue(typeCharacter.getName(), typeCharacter.getHpPoint());
    }
}
