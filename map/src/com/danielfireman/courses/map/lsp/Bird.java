package com.danielfireman.courses.map.lsp;

/**
 * A bird that could be drawn on the screen.
 */
interface Bird {
    /** Sets the bird geografic location. */
    void setLocation(double longitude, double latitude);
    /** Sets the bird altitude, in meters. */
    void setAltitude(double altitude);
    /** Draws the bird on the screen */
    void draw();
}
