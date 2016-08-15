package com.danielfireman.courses.map.lsp;

/**
 * Second solution to the birds/Peguin problem.
 */
class Solution2 {
    private static class Penguin implements Locatable, Drawable {
        double longitude, latitude;
        @Override
        public void setLocation(double longitude, double latitude) {
            this.longitude = longitude;
            this.latitude = latitude;
        }
        @Override
        public void draw() {
            System.out.printf("Penguin is at (%f,%f)\n", this.latitude, this.longitude);
        }
    }

    private static void draw(Drawable d) {
        d.draw();
    }

    public static void main(String []args) {
        Penguin locatable = new Penguin();
        locatable.setLocation(10.0, 10.0);
        draw(locatable);
    }
}