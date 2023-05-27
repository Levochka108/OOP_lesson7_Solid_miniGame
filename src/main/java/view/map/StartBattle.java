package view.map;

import model.Character;
import model.nps.Monster;

public interface StartBattle {
    void battle(Character character, Monster monsterBoss);
}
