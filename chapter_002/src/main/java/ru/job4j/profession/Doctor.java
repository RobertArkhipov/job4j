package ru.job4j.profession;

public class Doctor extends Profession {
    private Diagnose diagnose = new Diagnose();

    public Diagnose heal(Pacient pacient) {
        return diagnose;
    }
}
