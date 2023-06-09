/**
 * @author Dmitrii Klochkov
 * Date:27.05.2023
 * Time:9:06
 */
package model.character;

import model.Character;
import model.weapon.Bow;

public class Hunter extends Character implements Bow {
   int attack;
    public Hunter(String name, int hpPoint , int attack) {
        super(name, hpPoint);
        this.attack = attack;
    }
    public Hunter(String name, int hpPoint) {
        super(name, hpPoint);
    }
    @Override
    public String toString() {
        return "npc: Hunter is radu! \n"+ getName()+" Hp:"+getHpPoint();
    }


}
