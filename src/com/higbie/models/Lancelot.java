package com.higbie.models;

public class Lancelot extends Warrior {

    private String name = "Lancelot";

    public Lancelot(String name, int battlePower) {
        super(name, battlePower);
    }

    @Override
    public void fightToKill() {
        System.out.println("A warrior dressed in white armor yells, \"You shall die like the child you are!\"");
        System.out.println("Fight or run?");

    }
}
