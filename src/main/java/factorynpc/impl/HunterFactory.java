/**
 * @author Dmitrii Klochkov
 * Date:27.05.2023
 * Time:9:34
 */
package factorynpc.impl;

import factorynpc.CharacterFactory;
import model.Character;
import model.character.Hunter;

public class HunterFactory implements CharacterFactory {
    @Override
    public Character createCharacter(Character typeCharacter) {
        return new Hunter(typeCharacter.getName(), typeCharacter.getHpPoint());
    }
}
