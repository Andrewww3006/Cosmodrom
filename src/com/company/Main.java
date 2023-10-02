package com.company;

import com.company.servic.IStart;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cosmodrom starter = new Cosmodrom();
        IStart shatl = new Shatl();
        IStart spacex = new SpaceX(24);
        starter.launch(shatl);
        starter.launch(spacex);


    }
}
