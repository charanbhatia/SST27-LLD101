package com.example.game;

/**
 * Starter demo using only the base character.
 * TODOs guide you to implement decorators and compose them.
 */
public class GameDemo {
    public static void main(String[] args) {
        Character base = new BaseCharacter();

        System.out.println("=== Base Character ===");
        base.move();
        base.attack();
        System.out.println("Base stats - Speed: " + base.getSpeed() + ", Damage: " + base.getDamage() + ", Sprite: " + base.getSprite());

        System.out.println("\n=== Base + SpeedBoost ===");
        Character withSpeed = new SpeedBoost(base, 3);
        withSpeed.move();
        withSpeed.attack();
        System.out.println("Stats - Speed: " + withSpeed.getSpeed() + ", Damage: " + withSpeed.getDamage() + ", Sprite: " + withSpeed.getSprite());

        System.out.println("\n=== Base + DamageBoost ===");
        Character withDamage = new DamageBoost(base, 15);
        withDamage.move();
        withDamage.attack();
        System.out.println("Stats - Speed: " + withDamage.getSpeed() + ", Damage: " + withDamage.getDamage() + ", Sprite: " + withDamage.getSprite());

        System.out.println("\n=== Base + SpeedBoost + DamageBoost ===");
        Character buffed = new DamageBoost(new SpeedBoost(base, 3), 15);
        buffed.move();
        buffed.attack();
        System.out.println("Buffed stats - Speed: " + buffed.getSpeed() + ", Damage: " + buffed.getDamage() + ", Sprite: " + buffed.getSprite());

        System.out.println("\n=== Adding GoldenAura (with sprite change + buffs) ===");
        Character shiny = new GoldenAura(buffed);
        shiny.move();
        shiny.attack();
        System.out.println("Golden stats - Speed: " + shiny.getSpeed() + ", Damage: " + shiny.getDamage() + ", Sprite: " + shiny.getSprite());

        System.out.println("\n=== Removing GoldenAura (recomposition) ===");
        Character withoutAura = buffed; // Remove aura by going back to previous composition
        withoutAura.move();
        withoutAura.attack();
        System.out.println("Back to buffed stats - Speed: " + withoutAura.getSpeed() + ", Damage: " + withoutAura.getDamage() + ", Sprite: " + withoutAura.getSprite());

        System.out.println("\n=== Complex Composition: Multiple SpeedBoosts + DamageBoosts + GoldenAura ===");
        Character superBuffed = new GoldenAura(
            new DamageBoost(
                new SpeedBoost(
                    new DamageBoost(
                        new SpeedBoost(base, 5), 
                        10
                    ), 
                    7
                ), 
                20
            )
        );
        superBuffed.move();
        superBuffed.attack();
        System.out.println("Super stats - Speed: " + superBuffed.getSpeed() + ", Damage: " + superBuffed.getDamage() + ", Sprite: " + superBuffed.getSprite());
    }
}
