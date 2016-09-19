package com.danielfireman.courses.map.wrappers;

import java.io.IOException;

class ImagemComFiltro implements Imagem {
    Cabecalho cabecalho;
    Imagem img;
    Path path;

    ImagemComFiltro(Imagem img, Path path, Cabecalho cabecalho) {
        this.img = img;
        this.cabecalho = cabecalho;
        this.path = path;
    }

    @Override
    public void draw() throws IOException {
        byte[][] content = this.img.content();
        // aplica filtro ao conteúdo.
        System.out.println("Desenha imagem com filtro " + largura() + " x " + altura());
    }

    @Override
    public short altura() {
        return this.cabecalho.altura();
    }

    @Override
    public short largura() {
        return this.cabecalho.largura();
    }

    @Override
    public String getTipo() {
        return this.path.getTipo();
    }

    @Override
    public byte[][] content() throws IOException { return this.img.content(); }
}