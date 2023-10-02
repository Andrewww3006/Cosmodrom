package com.company;

import com.company.servic.IStart;

public class SpaceX implements IStart {
    double weight;
    public SpaceX(double weight)
    {this.weight = weight;}

    @Override
    public boolean testStart() {
        return !(weight > 25);
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели SpaceX запущены. Все системы в норме");
    }

    @Override
    public void start() {
        System.out.println("Старт SpaceX");
    }
}
