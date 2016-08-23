package com.danielfireman.courses.map.abstractfactory;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

/**
 * Example of the problem of the abstract factory.
 */
class Problem  {   
    private interface Tire {}
    private interface Door{}
    private interface Car {
        List<Tire> getTires();
        List<Door> getDoors();
    }
    private static class HatchCar implements Car {
        List<Tire> tires;
        List<Door> doors;
        public HatchCar(List<Tire> tires, List<Door> doors) {
            this.tires = tires;
            this.doors = doors;
        }
        public List<Tire> getTires() { return tires; }
        public List<Door> getDoors() { return doors; }
    }
    
    public static void main(String []args) {
        List<Tire> fitTires = new LinkedList<>();
        fitTires.add(new Tire(){});
        fitTires.add(new Tire(){});
        fitTires.add(new Tire(){});
        fitTires.add(new Tire(){});

        List<Door> fitDoors = new LinkedList<>();
        fitDoors.add(new Door(){});
        fitDoors.add(new Door(){});
        fitDoors.add(new Door(){});
        fitDoors.add(new Door(){});

        Car fit = new HatchCar(fitTires, fitDoors);
    }
}