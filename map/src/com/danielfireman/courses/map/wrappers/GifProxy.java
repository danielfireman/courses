package com.danielfireman.courses.map.wrappers;

class GifProxy extends Gif {
    Cabecalho cabecalho;
    Path path;
    GifProxy(Path path, Cabecalho cabecalho) {
        super(path.get());
        this.path = path;
        this.cabecalho = cabecalho;
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
}