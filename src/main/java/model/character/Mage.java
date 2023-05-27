/**
 * @author Dmitrii Klochkov
 * Date:27.05.2023
 * Time:9:07
 */
package model.character;

import model.Character;
import model.weapon.MagicStaff;

public class Mage extends Character implements MagicStaff {
    private final int manaPoint;

    {
        manaPoint = 100;
    }

    public Mage(String name, int hpPoint) {
        super(name, hpPoint);
    }


    public int getManaPoint() {
        return manaPoint;
    }

    @Override
    public String toString() {
        return "npc: Mage is radu! \n"+ getName()+" Hp:"+getHpPoint()+" Mp:"+ getManaPoint();
    }
}
