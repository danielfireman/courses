package com.danielfireman.courses.map.wrappers;

/**
 * Adaptador.
 */
class ImprovedGif {
    class TenteiENaoConseguiAbrirException extends Exception{}

    String path;
    ImprovedGif(String path) {
        this.path = path;
    }

    public void draw() throws TenteiENaoConseguiAbrirException {
        System.out.println("Imagem "+ this.path +" adaptada usando ImprovedGif.");
    }
}