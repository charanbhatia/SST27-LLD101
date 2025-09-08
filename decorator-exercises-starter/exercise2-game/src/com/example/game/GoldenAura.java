package com.example.game;

/**
 * GoldenAura decorator that changes the character's sprite to a golden version
 * and provides small buffs to both speed and damage while adding special effects.
 */
public class GoldenAura extends CharacterDecorator {
    private final int speedBuff;
    private final int damageBuff;

    public GoldenAura(Character character) {
        super(character);
        this.speedBuff = 2;  // Small speed buff
        this.damageBuff = 3; // Small damage buff
    }

    @Override
    public void move() {
        System.out.println("✨ Golden aura glimmers ✨");
        System.out.println("Moving at speed " + getSpeed() + " with sprite " + getSprite() + " [GOLDEN AURA ACTIVE!]");
    }

    @Override
    public void attack() {
        System.out.println("⚡ Golden energy surges ⚡");
        System.out.println("Attacking with damage " + getDamage() + " using sprite " + getSprite() + " [GOLDEN AURA ACTIVE!]");
    }

    @Override
    public int getSpeed() {
        return character.getSpeed() + speedBuff;
    }

    @Override
    public int getDamage() {
        return character.getDamage() + damageBuff;
    }

    @Override
    public String getSprite() {
        // Transform any sprite to its golden version
        String originalSprite = character.getSprite();
        return "golden_" + originalSprite;
    }
}
