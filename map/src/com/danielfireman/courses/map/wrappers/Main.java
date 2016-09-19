package com.danielfireman.courses.map.wrappers;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] caminhos = new String[]{
            "img.gif",
            "img1.gif"
        };

        FabricaDeImagens fabrica = new FabricaDeImagens();

        System.out.println("Nome\tTipo\tAltura\tLargura");
        for (String path : caminhos) {
            Imagem img = fabrica.novaInstancia(path);
            System.out.println(path + "\t" + img.getTipo() + "\t" + img.altura() + "\t" +
                    img.largura());
        }

        Imagem img = fabrica.novaInstancia("img.gif");
        System.out.println("Draw: " + img.getTipo());
        img.draw();
    }
}