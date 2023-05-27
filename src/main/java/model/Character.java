/**
 * @author Dmitrii Klochkov
 * Date:27.05.2023
 * Time:9:00
 */
package model;

public abstract class Character {
    String name;
    int hpPoint;

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
}
