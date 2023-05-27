/**
 * @author Dmitrii Klochkov
 * Date:27.05.2023
 * Time:9:04
 */
package model.character;

import model.Character;
import model.weapon.SwordAndShield;

public class Warrior extends Character implements SwordAndShield {
    public Warrior(String name, int hpPoint) {
        super(name, hpPoint);
    }

    @Override
    public String toString() {
        return "npc: Warrior is radu! \n"+ getName()+" Hp:"+getHpPoint();
    }
}
