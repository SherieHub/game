/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

/**
 *
 * @author Sherielyn
 */
class MainCharacter extends Character {

    public MainCharacter(String name, int hp, int energy) {
        super(name, hp, energy);
    }

    @Override
    public void attack(Character target) {
        int damage = getEnergy() * 10;  
        System.out.println(getName() + " attacks " + target.getName() + " for " + damage + " damage."); 
        target.takeDamage(damage);
    }

    public void farm() {
        System.out.println(getName() + " is farming to restore energy.");
        setEnergy(getEnergy() + 2);  
    }
}
