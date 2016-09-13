package com.danielfireman.courses.map.wrappers;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] caminhos = new String[]{
            "img.gif",
                "img1.gif"
        };

        FabricaDeImagens fabrica = new FabricaDeImagens();

        System.out.println("Nome\t\tTipo\t\tAltura\t\tLargura");
        for (String path : caminhos) {
            Imagem img = fabrica.novaInstancia(path);
            System.out.println(path + "\t\t" + img.getTipo() + "\t\t" + img.altura() + "\t\t" +
                    img.largura());
        }
    }
}