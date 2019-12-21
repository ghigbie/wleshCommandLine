package com.higbie.models;

public class Player {

    public Player(String name, int power, int life, int maxLife) {
        this.name = name;
        this.battlePower = power;
        this.life = life;
        this.maxLife = maxLife;
    }

    private String name;
    private int battlePower;
    private int life;
    private int maxLife;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBattlePower() {
        return battlePower;
    }

    public void setBattlePower(int battlePower) {
        this.battlePower = battlePower;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getMaxLife() {
        return maxLife;
    }

    public void setMaxLife(int maxLife) {
        this.maxLife = maxLife;
    }

    private void declarePlayer(){
        System.out.println("You are the great" + this.name + "!");
        System.out.println("Your battlePower is " + this.battlePower + ".");
        System.out.println("Your life is " + this.life + " of a maximum life of " + this.maxLife );
    }
}
