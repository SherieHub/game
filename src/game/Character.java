/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

/**
 *
 * @author Sherielyn
 */
abstract class Character {
    private String name;
    private int hp;
    private int energy;

    public Character(String name, int hp, int energy) {
        this.name = name;
        this.hp = hp;
        this.energy = energy;
    }

    public abstract void attack(Character target);
    
    public void takeDamage(int damage) {
        hp -= damage;
        if (hp < 0) hp = 0;
        System.out.println(name + " takes " + damage + " damage. (remaining HP: " + hp + ")");
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }
    
    public int getEnergy() {
        return energy;
    }
    
    public void setEnergy(int energy) {
        this.energy = energy;
    }
}
