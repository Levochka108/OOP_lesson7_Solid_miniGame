/**
 * @author Dmitrii Klochkov
 * Date:28.05.2023
 * Time:0:06
 */
package model.nps;

import model.Character;
import model.weapon.Claws;

public class Monster extends Character implements Claws {
    int attack;

    public Monster(String name, int hpPoint, int attack) {
        super(name, hpPoint);
        this.attack = attack;
    }

    @Override
    public String toString() {
        return "npc: Monster \n" + getName() + " Hp:" + getHpPoint();
    }

    @Override
    public void attack(Character target) {
        super.attack(target);
    }

    @Override
    public void defence() {
        super.defence();
    }
}
