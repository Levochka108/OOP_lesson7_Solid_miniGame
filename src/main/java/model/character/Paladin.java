/**
 * @author Dmitrii Klochkov
 * Date:27.05.2023
 * Time:12:03
 */
package model.character;

import model.Character;
import model.weapon.magicspells.PaladinSpell;

public class Paladin extends Character implements PaladinSpell {
    private final int manaPoint;
    int attack;

    {
        manaPoint = 100;
    }

    public Paladin(String name, int hpPoint, int attack) {
        super(name, hpPoint);
        this.attack = attack;
    }
    public Paladin(String name, int hpPoint) {
        super(name, hpPoint);
    }
    public int getManaPoint() {
        return manaPoint;
    }

    @Override
    public String toString() {
        return "npc: Paladin is radu! \n" + getName() + " Hp:" + getHpPoint() + " Mp:" + getManaPoint();
    }
}
