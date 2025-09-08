package com.example.game;

/**
 * DamageBoost decorator that increases the character's damage by a specified amount.
 * Overrides getDamage() to return boosted damage and updates attack() to reflect the change.
 */
public class DamageBoost extends CharacterDecorator {
    private final int damageIncrease;

    public DamageBoost(Character character, int damageIncrease) {
        super(character);
        this.damageIncrease = damageIncrease;
    }

    @Override
    public void attack() {
        System.out.println("Attacking with damage " + getDamage() + " using sprite " + getSprite() + " [DAMAGE BOOSTED!]");
    }

    @Override
    public int getDamage() {
        return character.getDamage() + damageIncrease;
    }
}
