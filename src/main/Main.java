package main;

import controller.Manager;
import model.Country;

public class Main {

    public static void main(String[] args) {
        Country c = new Country();
        
        new Manager(c).run();
    }
    
}