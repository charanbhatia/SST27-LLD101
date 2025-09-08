package com.example.game;

/**
 * SpeedBoost decorator that increases the character's speed by a specified amount.
 * Overrides getSpeed() to return boosted speed and updates move() to reflect the change.
 */
public class SpeedBoost extends CharacterDecorator {
    private final int speedIncrease;

    public SpeedBoost(Character character, int speedIncrease) {
        super(character);
        this.speedIncrease = speedIncrease;
    }

    @Override
    public void move() {
        System.out.println("Moving at speed " + getSpeed() + " with sprite " + getSprite() + " [SPEED BOOSTED!]");
    }

    @Override
    public int getSpeed() {
        return character.getSpeed() + speedIncrease;
    }
}
