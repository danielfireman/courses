package com.danielfireman.courses.map.factorymethod;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

/**
 * Good example of factory method.
 */
class Good  {   
    // Interfaces.
    interface Car {
        String showInfo();
    }
    interface CarFactory {
        Car createCar();
    } 

    // Implementation.
    static class Palio implements Car {
        public String showInfo() {
            return "Palio";
        }
    }
    static class Hb20 implements Car {
        public String showInfo() {
            return "Hb20";
        }
    }
    static class Fiat implements CarFactory {
        public Car createCar() {
            return new Palio();
        }
    }
    
    static class Hyundai implements CarFactory {
        public Car createCar() {
            return new Hb20();
        }
    }

    public static void main(String []args) {
        Car palio = new Fiat().createCar();
        System.out.println("Fiat factory creates " + palio.showInfo());

        Car hb20 = new Hyundai().createCar();
        System.out.println("Hyunday factory creates " + hb20.showInfo());
    }
}