/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

/**
 *
 * @author Sherielyn
 */
class Monster extends Character {
    
    public Monster(String name, int hp, int energy) {
        super(name, hp, energy);
    }

    @Override
    public void attack(Character target) {
        int damage = getEnergy() * 15; 
        System.out.println(getName() + " attacks " + target.getName() + " for " + damage + " damage.");  
        target.takeDamage(damage);
    }
}
