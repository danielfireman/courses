package com.danielfireman.courses.map.lsp;

/**
 * First solution to the birds/Peguin problem.
 * Hint1: it is wrong.
 * Hint2: It violates OCP and LSP.
 */
class Solution1 {
    private static class Penguin implements Bird {
        double longitude, latitude;

        @Override
        public void setLocation(double longitude, double latitude) {
            this.longitude = longitude;
            this.latitude = latitude;
        }

        // If an override method does nothing or just throws an exception, then you're probably violating the LSP.
        @Override
        public void setAltitude(double altitude) {
            throw new RuntimeException("Penguins can't fly.");
        }

        @Override
        public void draw() {
            System.out.printf("Penguin is at (%d,%d)", this.latitude, this.longitude);
        }
    }
    public static void main(String []args) {
        Bird bird = new Penguin();
        bird.setAltitude(10);
    }
}