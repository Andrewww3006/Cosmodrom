package com.company;

import com.company.servic.IStart;

public class Cosmodrom{
    public void launch(IStart spaceship)
    {
        if(!spaceship.testStart())
            System.out.println("Предстартовая проверка провалена");
        else {spaceship.startEngine();
                for (int x = 10; x>0;x--) {
                    System.out.print(x+" ");
                    try {
                        Thread.sleep(500); // Задержка в 0.5 секунду
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            System.out.println();
                spaceship.start();
        }

    }
}
