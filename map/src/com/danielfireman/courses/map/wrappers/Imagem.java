package com.danielfireman.courses.map.wrappers;

import java.io.IOException;

/**
 * Exemplo da motivação para uso de wrappers.
 */
interface Imagem {
    /**
     * @return Tamanho da imagem em bytes.
     */
    long tamanho();

    /**
     * Desenha a imagem no console, usando ASCII art.
     */
    void drawAsciiArt() throws IOException;
}