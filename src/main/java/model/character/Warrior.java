/**
 * @author Dmitrii Klochkov
 * Date:27.05.2023
 * Time:9:04
 */
package model.character;

import model.Character;
import model.weapon.SwordAndShield;

public class Warrior extends Character implements SwordAndShield {
    int attack;
    public Warrior(String name, int hpPoint ,int attack) {
        super(name, hpPoint);
        this.attack = attack;
    }

    public Warrior(String name, int hpPoint) {
        super(name,hpPoint);
    }

    @Override
    public String toString() {
        return "npc: Warrior is radu! \n"+ getName()+" Hp:"+getHpPoint();
    }

    @Override
    public void attack(Character target) {
        target.attack(target);
    }

    @Override
    public void defence() {
        super.defence();
    }
}
