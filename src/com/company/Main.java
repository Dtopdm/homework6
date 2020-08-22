package com.company;

import kg.geekteck.lesson6.homework.Boss;
import kg.geekteck.lesson6.homework.Weapon;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setDamage(50);
        boss.setHealth(700);

        Weapon bossWeapon = new Weapon("Sword", "Katana");
        boss.setBossWeapon(bossWeapon);

        System.out.println("Boss: Boss  health - " + boss.getHealth() + " Boss damage - " + boss.getDamage()
                + " Boss weapon type - " + boss.getBossWeapon().getWeaponType() + " Boss weapon name - " + boss.getBossWeapon().getWeaponName());
    }
}
