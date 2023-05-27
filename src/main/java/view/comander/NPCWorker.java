/**
 * @author Dmitrii Klochkov
 * Date:27.05.2023
 * Time:13:06
 */
package view.comander;

import view.ViewWorkingConstructor;

import java.util.Scanner;

public class NPCWorker implements Worker{
    @Override
    public void showMenuWorker() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Worker rade to work!");
        ViewWorkingConstructor worker = new ViewWorkingConstructor();
        System.out.println("What balding now?");
        System.out.println("1 - Infantry Barracks");
        System.out.println("2 - Divine Temple");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                worker.createInfantryBarracks();
                System.out.println();
            }
            case 2 -> {
                worker.createDivineTemple();
                System.out.println();
            }
        }
    }
}
