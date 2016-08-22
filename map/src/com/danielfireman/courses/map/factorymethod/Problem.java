package com.danielfireman.courses.map.factorymethod;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

/**
 * Example of the problem of the factory method.
 */
class Problem  {   
    // Interfaces.
    interface Car {
        String showInfo();
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
    public static void main(String []args) {
        Car palio = new Palio();
        System.out.println("Fiat factory creates " + palio.showInfo());

        Car hb20 = new Hb20();
        System.out.println("Hyunday factory creates " + hb20.showInfo());
    }
}