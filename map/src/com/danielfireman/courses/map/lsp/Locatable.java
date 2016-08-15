package com.danielfireman.courses.map.lsp;

/** Something that could localized through GPS coordinates */
interface Locatable {
    /** Sets the bird geografic location. */
    void setLocation(double longitude, double latitude);
}