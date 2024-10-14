/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package game;

/**
 *
 * @author Sherielyn
 */
public class Game {
    public static void main(String[] args) {
        //Main characters
        MainCharacter khai = new MainCharacter("Farmer Khai", 100, 0);
        MainCharacter hakobe = new MainCharacter("Hakobe", 100, 2);
        MainCharacter andres = new MainCharacter("Andres", 1000, 1);
        
        //Monsters
        Monster acrobat = new Monster("Acrobat", 400, 1);
        Monster juggler = new Monster("Juggler", 425, 1);
        Monster tamer = new Monster("Tamer", 550, 1);
        Monster jalOLantern = new Monster("Jal O' Lantern", 1250, 1);
        
        // Example fight 
        System.out.println("Battle begins!");
        hakobe.attack(acrobat);
        if (acrobat.isAlive()) {
            acrobat.attack(hakobe);
        }
        andres.attack(juggler);
        if (juggler.isAlive()) {
            juggler.attack(andres);
        }
        khai.farm();  // Khai restores energy while others fight
    }
}
