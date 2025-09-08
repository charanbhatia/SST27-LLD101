package com.example.game;

/**
 * Base decorator class that implements Character and wraps another Character.
 * Concrete decorators will extend this class and add their own behavior
 * while delegating to the wrapped character.
 */
public abstract class CharacterDecorator implements Character {
    protected final Character character;

    public CharacterDecorator(Character character) {
        this.character = character;
    }

    @Override
    public void move() {
        character.move();
    }

    @Override
    public void attack() {
        character.attack();
    }

    @Override
    public int getSpeed() {
        return character.getSpeed();
    }

    @Override
    public int getDamage() {
        return character.getDamage();
    }

    @Override
    public String getSprite() {
        return character.getSprite();
    }
}
