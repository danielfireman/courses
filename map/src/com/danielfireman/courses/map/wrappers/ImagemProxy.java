package com.danielfireman.courses.map.wrappers;

import java.io.IOException;

class ImagemProxy implements Imagem {
    Cabecalho cabecalho;
    Imagem imagem;
    Path path;

    ImagemProxy(Imagem imagem, Path path, Cabecalho cabecalho) {
        this.imagem = imagem;
        this.cabecalho = cabecalho;
        this.path = path;
    }

    @Override
    public short altura() {
        return this.cabecalho.altura();
    }

    @Override
    public short largura() {
        return this.cabecalho.largura();
    }

    public String getTipo() {
        return this.path.getTipo();
    }

    @Override
    public void draw() throws IOException {
        this.imagem.draw();
    }

    @Override
    public byte[][] content() throws IOException {
        return this.imagem.content();
    }

    @Override
    public String toString() {
        return "Path: " + this.path.get() +" Tipo:" + getTipo() + " largura:" + largura() + " altura:" + altura();
    }
}