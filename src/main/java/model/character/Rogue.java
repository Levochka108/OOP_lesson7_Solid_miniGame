/**
 * @author Dmitrii Klochkov
 * Date:27.05.2023
 * Time:9:08
 */
package model.character;

import model.Character;
import model.weapon.Daggers;

public class Rogue extends Character implements Daggers {
    int attack;
    public Rogue(String name, int hpPoint ,int attack) {
        super(name, hpPoint);
        this.attack = attack;
    }
    public Rogue(String name, int hpPoint) {
        super(name, hpPoint);
    }
    @Override
    public String toString() {
        return "npc: Rogue is radu! \n"+ getName()+" Hp:"+getHpPoint();
    }
}
