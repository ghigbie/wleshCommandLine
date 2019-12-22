package com.higbie.models;

public class Knight {
    private int battlePower;
    private String name;

    public Knight(String name, int battlePower) {
        this.battlePower = battlePower;
        this.name = name;
    }

    public int getBattlePower() {
        return battlePower;
    }

    public void setBattlePower(int battlePower) {
        this.battlePower = battlePower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void fightToKill(){
        System.out.println(getName() + " draws his weapon and points it at your throat.");
        System.out.println("");
    }
}
