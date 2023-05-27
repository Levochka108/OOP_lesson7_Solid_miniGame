/**
 * @author Dmitrii Klochkov
 * Date:27.05.2023
 * Time:9:00
 */
package model;

import model.weapon.Weapon;

public abstract class Character  implements Weapon {
    String name;
    int hpPoint;
    int attack;

    public Character(String name, int hpPoint) {
        this.name = name;
        this.hpPoint = hpPoint;

    }

    public String getName() {
        return name;
    }

    public int getHpPoint() {
        return hpPoint;
    }

    @Override
    public void attack(Character target) {
        takeDamage(attack);
    }

    public void defence(){
        System.out.println( getName() +" защищается");
    }
    public void takeDamage(int amount){
        hpPoint -= amount;
    }
}
