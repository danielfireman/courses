package com.danielfireman.courses.map.wrappers;

class CabecalhoGif implements Cabecalho {
    String path;
    CabecalhoGif(String path) {
        this.path = path;
    }
    @Override
    public short altura() {
        return 256;
    }

    @Override
    public short largura() {
        return 256;
    }
}