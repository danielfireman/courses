package com.danielfireman.courses.map.abstractfactory;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

/**
 * Good example of the abstract factory.
 */
class Good  {
    private interface Tire {}
    private interface Door{}
    private interface Car {
        List<Tire> getTires();
        List<Door> getDoors();
    }
    private interface CarPartsFactory {
        Tire createTire();
        Door createDoor();
    }
    private static class HatchPartsFactory {
        public Tire createTire() { return new Tire() {}; } // Small Door
        public Door createDoor() { return new Door(){}; }  // Small Door
    }
    private static class SuvPartsFactory {
        public Tire createTire() { return new Tire() {}; } // Big Tire
        public Door createDoor() { return new Door(){}; }  // Big Door
    }
}
