package com.company;

import com.company.servic.IStart;

import java.util.Random;

public class Shatl extends Cosmodrom implements IStart {


    @Override
    public boolean testStart() {
        Random random = new Random();
        return random.nextInt(10) > 3;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");
    }
}
